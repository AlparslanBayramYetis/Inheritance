package Inheritance2;

public class Hayvan {

    private String hayvan;

    private int kilo;

    private int boy;

    private int bacak_sayisi;

    public Hayvan(String hayvan, int kilo, int boy, int bacak_sayisi) {
        this.hayvan = hayvan;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;

    }
    public void yemekye(){

        System.out.println("Hayvan şuan yemek yiyor...");
    }
    public void harekete_gec(int hiz){
        System.out.println("Hayvan "+hiz +" ile hareket ediyor...");
    }
}
