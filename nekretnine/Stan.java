package predavanje3.nekretnine;

public class Stan extends Nekretnina {

    double povrsinaPodruma;
    double povrsinaTerase;

    Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaTerase, double povrsinaPodruma){
        super(adresa,zona,kvadratura,vlasnik);
        this.povrsinaTerase = povrsinaTerase;
        this.povrsinaPodruma = povrsinaPodruma;

    }

    double cenaDodataka(){
        double p = (this.povrsinaPodruma+this.povrsinaTerase)*0.33;
        return cenaPoZoni(p);
    }


    public String toString(){
        return "Stan se nalazi u ulici " + adresa + " zoni " + zona + " i ima " + kvadratura + " metara kvadratnih i kosta " + cenaNekretnine()  + ".\n" + vlasnik;
    }
}
