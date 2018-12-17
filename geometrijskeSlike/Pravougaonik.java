package predavanje3.geometrijskeSlike;

public class Pravougaonik extends Kvadrat {

    double b;

    public Pravougaonik(){
        super();
        b = 2*a;
    }

    public Pravougaonik(double a){
        super(a);
        b = 2*a;
    }

    public Pravougaonik(double a, double b){
        super(a);
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a*b;
    }

    @Override
    public double obim() {
        return a*2 + b*2;
    }

    public String toString(){
        return "Povrsina pravougaonika je " + this.povrsina() + "." + " Obim pravougaonika je " + this.obim();
    }
}
