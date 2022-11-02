package mrokumuspractice;

public class MrOkumus {
    /*

Galatasaraya  futbolcu transfer etmek istiyorum :

   1. Ulkesi    = Cek
   2. Yas       = 27
   3. Bonservis = 10.000.000 $
   4. Boy       = 177
   5  Maas      = 3.500.000 $


  # Yetenek #
   1. Spor yapabilen
   2. Futbol oynayabilen
   3. Hizli kosabilen
   4. Sag ayagini kullanabilen


   package sorucozumu.transfer1;

public class Sporcu {


    String brans;

    public void sporYap(){
        System.out.println("Spor yapabilir.");
    }



    public Sporcu(){

    }

    public Sporcu(String brans){
        this.brans = brans;
        System.out.println("Sporcudan===> brans");
    }

}





package sorucozumu.transfer1;

public class Futbolcu extends Sporcu{

    public void futbolOyna(){

        System.out.println("Futbol oynayabilir.");
    }

    String ulke;
    int maas;
    int bonservis;
    int boy;
    public Futbolcu(){

    }

    public Futbolcu(String ulke){
        super("Futbolcu");
        this.ulke = ulke;

        System.out.println("Futbolcu'dan==== > ulke");
    }

    public Futbolcu(int maas, int bonservis){
        this.maas = maas;
        this.boy = bonservis;

    }


    public Futbolcu(String ulke,  int bonservis, int maas, int boy){
        super("Futbolcu");
        this.ulke = ulke;
        this.maas = maas;
        this.boy = bonservis;
        this.boy = boy;

        System.out.println("Futbolcudan===> ulke + maas+ bonservis+ boy");
    }
}








package sorucozumu.transfer1;

public class TransferEdecegimSolAcik extends SolAcik{

    public void sagAyak(){
        System.out.println("Sag ayagini kullanabilir.");
    }

    int maas;
    int boy;
    String ulke;

    public  TransferEdecegimSolAcik(){
        super(27);
        System.out.println("TransferEdecegimSolAcik 'dan ===> bos");

    }

    public  TransferEdecegimSolAcik(int maas){
        super(27);
        this.maas = maas;
        System.out.println("TransferEdecegimSolAcik'dan ====> mass");

    }

    public   TransferEdecegimSolAcik(int yas, int boy, String ulke){
        this.maas = yas;
        this.boy = boy;
        this.ulke = ulke;

    }


}
package sorucozumu.transfer1;

public class SolAcik extends Futbolcu{

    public void hizliKos(){

        System.out.println("Hizli kosabilir.");
    }

    int yas;
    int bonservis;
    int boy;

    public SolAcik(){

    }

    public SolAcik(int yas){
     this(1000000,177);
        this.yas = yas;

        System.out.println("SolAcik'dan ==> yas");
    }

    public SolAcik(int bonservis, int boy){
        super("Cek");
        this.bonservis = bonservis;
        this.boy = boy;

        System.out.println("Solacık'dan ===> bonservis + boy");

    }
}




package sorucozumu.transfer1;

public class Runner {

    public static void main(String[] args) {

        TransferEdecegimSolAcik pavelNedved = new TransferEdecegimSolAcik();


        System.out.println("==========================================");


        System.out.println("Pavel Nedved: " );
        pavelNedved.sporYap();
        pavelNedved.futbolOyna();
        pavelNedved.hizliKos();
        pavelNedved.sagAyak();

        System.out.println("==========================================");

        TransferEdecegimSolAcik pavelNedved1 = new TransferEdecegimSolAcik(350000);


    }
}
     */
}