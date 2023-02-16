package practicesorucozumanlatım;

public class Soru7 {
    private int numberBags;
    boolean call;

    public Soru7() {
        this.numberBags = 11;
        call = false;

    }
    public Soru7(int numberBags) {
        this.numberBags = numberBags;
        this.call = true;
    }

    public static void main(String[] args) {
        Soru7 seed = new Soru7();
        System.out.println(seed.numberBags+"--"/*+seed.call*/); //Output 11 dir /doğru

        Soru7 seed1 = new Soru7(7);
        System.out.println(seed1.numberBags);// Output 7 dir parametreli cons. calisir /doğru

        Soru7 seed3 = new Soru7();
        System.out.println(seed3.call);// Output false dir doğru

        Soru7 seed4 = new Soru7(7);
        System.out.println(seed4.call);// Gives Compile Time Error. vermez true verir

    }
}
