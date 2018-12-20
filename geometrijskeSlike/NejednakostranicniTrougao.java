package predavanje3.geometrijskeSlike;

public class NejednakostranicniTrougao extends Trougao {

    double b;
    double c;

    public NejednakostranicniTrougao(){
         super();
         b = 2*a;
         c = 2*a;
    }

    public NejednakostranicniTrougao(double b){
        super();
        this.b = b;
        c = b;
    }

    public NejednakostranicniTrougao(double a, double b, double c){
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double povrsina() {
        //Heronova formula
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double obim() {
        return a+b+c;
    }

    public String toString(){
        return "Povrsina nejednakostranicnog trougla je " + this.povrsina() + "." + " Obim nejednakostranicnog trougla je " + this.obim();
    }

}
