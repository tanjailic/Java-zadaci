package predavanje3.geometrijskeSlike;

public class Trougao extends GeometrijskaSlika {

    double a;

    public Trougao(){
        a = 1;
    }

    public Trougao(double a){
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a*a*Math.sqrt(3)/4;
    }

    @Override
    public double obim() {
        return a*3;
    }

    public String toString(){
        return "Povrsina trougla je " + this.povrsina() + "." + " Obim trougla je " + this.obim();
    }
}

