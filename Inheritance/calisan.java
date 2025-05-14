package Inheritance;

public class calisan {
        //Superclass veya Baseclass

    private String isim;
    private int maas;
    private String  departman;

    public calisan(String isim, int maas, String departman) {
        this.setIsim(isim);
        this.setMaas(maas);
        this.setDepartman(departman);
    }
    public void calis(){
        System.out.println("Çalışan çalışıyor....");
    }
    public void bilgilerigoster(){
        System.out.println("İSİM :" + getIsim());
        System.out.println("MAAŞ :" + getMaas());
        System.out.println("DEPARTMAN :" + getDepartman());

    }
    void depatman_degistir(String yenidepartman){
        System.out.println("depertman degistiriliyor...");
        this.setDepartman(yenidepartman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
