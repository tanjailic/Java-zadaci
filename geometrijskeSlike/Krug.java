package predavanje3.geometrijskeSlike;

public class Krug extends  GeometrijskaSlika {

    double r;

    public Krug(){
        r = 1;
    }

    public Krug(double r){
        this.r = r;
    }


    @Override
    public double povrsina() {
        return Math.PI*r*r;
    }

    @Override
    public double obim() {
        return (2*r)*Math.PI;
    }

    public String toString(){
       return "Povrsina kruga je " + this.povrsina() + "." + " Obim kruga je " + this.obim();
    }
}
