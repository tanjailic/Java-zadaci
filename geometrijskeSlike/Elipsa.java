package predavanje3.geometrijskeSlike;

public class Elipsa extends Krug {

    double b;

    public Elipsa(){
        super();
        b = 2*r;
    }

    public Elipsa(double r){
        super(r);
        b = 2*r;
    }

    public Elipsa(double r, double b){
        super(r);
        this.b = b;
    }


    @Override
    public double povrsina() {

        return r*b*Math.PI;
    }

    @Override
    public double obim() {
        //Koriscena je Ramanujanova aproksimacija
        return Math.PI*( 3*(r+b)-Math.sqrt((3*r + b)*(3*b+r)));
    }


    public String toString(){
        return "Povrsina elipse je " + this.povrsina() + "." + " Obim elipse je " + this.obim();
    }
}
