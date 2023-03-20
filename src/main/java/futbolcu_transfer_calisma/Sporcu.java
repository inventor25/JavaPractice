package futbolcu_transfer_calisma;

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
