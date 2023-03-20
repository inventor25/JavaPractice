package futbolcu_transfer_calisma;

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
