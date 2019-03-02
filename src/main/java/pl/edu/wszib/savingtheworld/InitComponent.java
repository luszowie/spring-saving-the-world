package pl.edu.wszib.savingtheworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.Faktura;
import pl.edu.wszib.savingtheworld.dao.FakturaDAO;
import pl.edu.wszib.savingtheworld.dao.Podatnik;
import pl.edu.wszib.savingtheworld.dao.PodatnikDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class InitComponent {

    @Autowired
    PodatnikDAO podatnikDAO;

    @Autowired
    FakturaDAO fakturaDAO;

    @PostConstruct
    public void init() {
        IntStream.range(0, 10).forEach(i -> {
            Faktura faktura = new Faktura(3.50, "cos" + i);
            faktura = fakturaDAO.save(faktura);
        });

        List<Faktura> wszystkie = fakturaDAO.findAll();

        IntStream.range(0, 50).forEach(i -> {
            Podatnik podatnik = new Podatnik("Adam", "Adam" + i);
            podatnik.setFaktury(Arrays.asList(wszystkie.get(i % 10)), wszystkie.get((i+5) %10)) ;
            podatnik = podatnikDAO.save(podatnik);
            podatnik.getImie();
        });
        System.out.println("");

    }
    // podatnikDAO.save(new Podatnik( "Adam1", "Adam"));
       /* podatnikDAO.save(new Podatnik( "Adam", "Adam"));
        podatnikDAO.save(new Podatnik( "Adam3", "Adam"));
        podatnikDAO.save(new Podatnik( "Adam4", "Adam"));
        podatnikDAO.save(new Podatnik( "Adam5", "Adam"));*/


    @PreDestroy
    public void teardown() {


    }


}