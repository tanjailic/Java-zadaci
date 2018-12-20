package predavanje3.nekretnine;

public class Kuca extends Nekretnina {

    double povrsinaOkucnice;

    Kuca(String adresa, int zona, int kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaOkucnice = povrsinaOkucnice;
    }

    double cenaDodataka() {
        double p = povrsinaOkucnice * 0.15;
        return cenaPoZoni(p);
    }


    public String toString() {
        return "Kuca se nalazi u " + adresa + zona + " ima " + kvadratura + " metara kvadratnih i kosta " + cenaNekretnine()  + ".\n"+ vlasnik;
    }
}
