package futbolcu_transfer_calisma;

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
