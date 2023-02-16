package practicesorucozumanlatım;

public class Soru8 {
    String value = "a";

    Soru8() {
        value = value + "b";//ab

    }

    Soru8(String deger) {

        value = value+ deger;//ar
    }

    public static void main(String[] args) {
        Soru8 order = new Soru8("f");
        System.out.println(order.value);// Output af dir / doğru

        Soru8 order1 = new Soru8();
        System.out.println(order1.value);// Output ab dir / doğru

        // error vermez
        Soru8 order3 = new Soru8("r");
        Soru8 order4 = new Soru8();
        System.out.println(order3.value +"+"+ order4.value);// Output arab dir doğru
    }
}
