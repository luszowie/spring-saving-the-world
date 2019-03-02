package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Podatnik {

    @Id
    @GeneratedValue
    public Long pesel;
    @Column(nullable = false)
    public String imie;
    @Column(nullable = false)
    public String nazwisko;

    public Podatnik(String imie, String nazwisko) {

        //this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @OneToMany(targetEntity = = Faktura.class, fetch = )
    List<Faktura> faktury;

    public Podatnik(){

    }

    public List<Faktura> getFaktury() {
        return faktury;
    }

    public void setFaktury(List<Faktura> faktury, Faktura faktura) {
        this.faktury = faktury;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
