package futbolcu_transfer_calisma;

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
