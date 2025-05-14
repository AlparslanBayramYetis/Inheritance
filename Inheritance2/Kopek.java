package Inheritance2;

public class Kopek extends Hayvan {
    private int dis_sayisi;
    public Kopek(String hayvan,int kilo,int boy,int bacak_sayisi, int dis_sayisi) {

        super(hayvan,kilo,boy,bacak_sayisi);
        this.setDis_sayisi(dis_sayisi);

    }
    public void harekete_gec(int hiz){
        System.out.println("Köpek "+hiz +" ile hareket ediyor...");
    }
    public void kos (int hiz){
        System.out.println("Köpek koşuyor...");

        harekete_gec(15);
    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
}
