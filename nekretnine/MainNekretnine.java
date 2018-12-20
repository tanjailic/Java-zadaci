package predavanje3.nekretnine;

public class MainNekretnine {
    public static void main(String[] args){
        Vlasnik tanja = new Vlasnik("Tanja", "Ilic", 1205990,123456);
        Nekretnina stan1 = new Stan("Borska 23", 2, 85, tanja, 10, 20);
        System.out.println(stan1);

        Vlasnik nalah = new Vlasnik("Nalah","Ilic",010601,654321);
        Nekretnina kuca1 = new Kuca("Pozeska 126", 1, 150, nalah, 30);
        System.out.println(kuca1);
    }
}
