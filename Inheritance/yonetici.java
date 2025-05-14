package Inheritance;

public class yonetici extends calisan {//Subclass
    private int sorumlukisi;

    public yonetici(String isim, int maas, String departman,int sorumlukisi) {

        super(isim, maas,departman);//Miras aldığım constructordaki bilgiileri kullanmak için yazılıyor.
        this.sorumlukisi=sorumlukisi;

    }
    public void zamYap(int zamMiktari){
        System.out.println("Çalışanlara" + zamMiktari +" tl zam yapıldı");
    }
    public void bilgilerigoster(){
        /*
        System.out.println("İSİM :" + getIsim());
        System.out.println("MAAŞ :" + getMaas());
        System.out.println("DEPARTMAN :" + getDepartman());*/

        super.bilgilerigoster();

        System.out.println("SORUMLU KİŞİ :" + sorumlukisi);
    }

}
