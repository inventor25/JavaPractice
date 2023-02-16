package practicesorucozumanlatım;

public class Soru6 {
    int price = 50;



    public Soru6(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Soru6 c1 = new Soru6(50);
        System.out.println(c1.price);
       // Soru6 c2 = new Soru6();// burda objeye parametre girilmediği için hata olınır
       // System.out.println(c2.price);
        Soru6 c3 = new Soru6(50);
        System.out.println(c3);// eğer .price yazılsaydı 50 yazardı ancak sadece c3 yazıldığı için sadece referans yazar
      //  Soru6 c4 = new Soru6(); aynı şekilde parametre girilmesi lazım
      //  System.out.println(c4);
    }
}
