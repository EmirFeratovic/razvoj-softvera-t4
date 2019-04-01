package sample;

import java.util.ArrayList;
import java.util.Objects;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal(String tekst) {
        ArrayList<String> razdvojeno = new ArrayList<String> ();

        for (String element : tekst.split(",")) {
            razdvojeno.add(element);
        }
        this.sifra = razdvojeno.get(0);
        this.naziv = razdvojeno.get(1);
        this.cijena = Double.parseDouble(razdvojeno.get(2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikal artikal = (Artikal) o;
        return Double.compare(artikal.cijena, cijena) == 0 &&
                Objects.equals(sifra, artikal.sifra) &&
                Objects.equals(naziv, artikal.naziv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sifra, naziv, cijena);
    }

    @Override
    public String toString() {
        return "Artikal{" +
                "sifra='" + sifra + '\'' +
                ", naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                '}';
    }



}