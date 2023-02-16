package Inheritancepractice.inheritanceconstructors;

public class UrunIsimler {
    String yag;
    int yagFiyat;
    int yagMiktar;
    String un;
    int unFiyat;
    int unMiktar;
    String yumurta;
    int yumurtaFiyat;
    int yumurtaMiktar;
    private String sut;
    int sutFiyat;
    int sutMiktar;

    public UrunIsimler() {

    }

    public UrunIsimler (String yag, String un, String yumurta, String sut){
    this.yag=yag;
    this.sut=sut;
    this.yumurta=yumurta;
    this.un=un;

    }

    public String getSut() {
        return sut;
    }

    public void setSut(String sut) {

        if (sut.equalsIgnoreCase("yağsız") || sut.equalsIgnoreCase("yağlı")) {
            this.sut = sut;
        } else {
            System.out.println("hatalı giriş");
        }
    }
}
