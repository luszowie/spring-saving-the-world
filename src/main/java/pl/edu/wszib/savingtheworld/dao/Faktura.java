package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long id;

    double kwota;
    String tytul;

    public Faktura() {
    }

    public Faktura(double kwota, String tytul) {
        this.kwota = kwota;
        this.tytul = tytul;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}
