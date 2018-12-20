package predavanje3.geometrijskeSlike;

public class Kvadrat extends GeometrijskaSlika {

    double a;

    public Kvadrat(){

        a = 1;
    }

    public Kvadrat(double a){
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a*a;
    }

    @Override
    public double obim() {
        return a*4;
    }

    public String toString(){
        return "Povrsina kvadrata je " + this.povrsina() + "." + " Obim kvadrata je " + this.obim();
    }
}
