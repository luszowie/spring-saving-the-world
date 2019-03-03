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
            Podatnik podatnik = new Podatnik("Adam", "Adam" + i);
            Podatnik podatnik1Saved = podatnikDAO.save(podatnik);

            IntStream.range(0,10).forEach(j -> {
                Faktura faktura = new Faktura(3.50, "cos" + j);
                faktura.setPodatnik (podatnik1Saved);
                faktura = fakturaDAO.save(faktura);
        });




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