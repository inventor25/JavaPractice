package practicesorucozumanlatım;

public class Runner {




    public static void main(String[] args) {

        Constructor01.mudur="veli";
        Constructor01.mudurYas=51;
        Constructor01 calisma01 = new Constructor01();

        calisma01.okulIsmi="Halide Edip";
        calisma01.dersIsmi="matematik";
        calisma01.OgrenciIsmi="mehmet";
        calisma01.OgrenciSinif=11;
        calisma01.OgrenciYas=17;
        calisma01.OgretmenIsmi="ahmet";
        calisma01.OgretmenYas=43;

        System.out.println(calisma01.okulIsmi+","+calisma01.dersIsmi+","+calisma01.
          OgrenciIsmi+","+calisma01.OgrenciSinif+","+calisma01.
          OgrenciYas+","+calisma01.OgretmenIsmi+","+
          calisma01.OgretmenYas+",,,,"+Constructor01.mudur+",,"+Constructor01.mudurYas);

        calisma01.BolgeIsmi("İstanbul");
        calisma01.OkulTuru("Fen");

         Constructor01 calisma02 = new Constructor01("ali",32);
         //Eğer constructor olusturulan classta atama yapılırsa constructur o değerleri dikkate alır
            System.out.println(calisma02.OgretmenIsmi+","+calisma02.OgretmenYas);





    }
}
