package Inheritance;

public class Main {
    //IS-A BAĞLANTISI VARDIR
    public static void main(String[] args) {
        yonetici yonetici1 = new yonetici("ALP",150000,"CEO",15);
        yonetici1.bilgilerigoster();
        yonetici1.zamYap(2500 );

    }

}
