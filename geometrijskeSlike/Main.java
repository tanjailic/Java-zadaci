package predavanje3.geometrijskeSlike;

public class Main {
    public static void main(String[] args){

        GeometrijskaSlika krug = new Krug(5);
        GeometrijskaSlika elipsa = new Elipsa();
        GeometrijskaSlika kvadrat = new Kvadrat();
        GeometrijskaSlika pravougaonik = new Pravougaonik(5,8);
        GeometrijskaSlika trougao = new Trougao(3);
        GeometrijskaSlika nejednakostranicanTrougao = new NejednakostranicniTrougao(8);


        System.out.println(krug);
        System.out.println(elipsa);
        System.out.println(kvadrat);
        System.out.println(pravougaonik);
        System.out.println(trougao);
        System.out.println(nejednakostranicanTrougao);

    }
}
