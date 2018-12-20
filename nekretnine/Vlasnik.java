package predavanje3.nekretnine;

public class Vlasnik {
    String ime;
    String prezime;
    long jmbg;
    int licnaKarta;

    public Vlasnik(){
        this.ime = "John";
        this.prezime = "Doe";
        this.jmbg = 123;
        this.licnaKarta = 007;
    }

    public Vlasnik(String ime,String prezime,long jmbg, int licnaKarta ){
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.licnaKarta = licnaKarta;
    }

    public String toString(){
        return "Vlasnik stana je " + ime + " " + prezime + " jmbg vlasnika je " + jmbg + ", broj licne karte vlasnika je " + licnaKarta + ".";
    }
}
