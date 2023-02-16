package practicesorucozumanlatım;

public class Constructor01 {

    static String mudur;
    static int mudurYas;

    String okulIsmi;
    String dersIsmi;
     String OgretmenIsmi="AKİF";
   String OgrenciIsmi;
    int OgretmenYas;
   int OgrenciYas;
    int OgrenciSinif;
    private  String isim = "Ozgür";


    public Constructor01() {  //bunu silersek runner class'ında obje olustururken parametre girmek zorundayız
        System.out.println("Default Constructor");
    }

        public Constructor01(String ifade, int OgretmenYas) {

        this.OgretmenIsmi = ifade;
        this.OgretmenYas = OgretmenYas;

    }

    public void BolgeIsmi(String bolgeIsmi) {
        System.out.println("Bu okulumuz " + bolgeIsmi + " çevresinde faliyet göstermektedir");
    }

    public void OkulTuru(String tur) {
        System.out.println("Bu okulumuz bir " + tur + " Lisesidir");

    }


}
