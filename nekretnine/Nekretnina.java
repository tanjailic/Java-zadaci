package predavanje3.nekretnine;

public abstract class Nekretnina {
    String adresa;
    int zona;
    double kvadratura;

    Vlasnik vlasnik;

    Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik){
        this.adresa = adresa;
        this.zona = zona;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }

    abstract double cenaDodataka();


     double cenaPoZoni(double kvadratura) {
        double cena = 0;
        switch (zona) {
            case 1:
                cena = (kvadratura * 3000);
                break;
            case 2:
                cena = (kvadratura * 2000);
                break;
            case 3:
                cena = (kvadratura * 1000);
                break;
            case 4:
                cena = (kvadratura * 500);
                break;
            default:
                System.out.println("Zona koju ste uneli ne postoji!");
        }
        return cena;
    }

    double cenaOsnovice(){
        return cenaPoZoni(kvadratura);
    }

    public double cenaNekretnine(){
         return cenaOsnovice() + cenaDodataka();
    }




}
