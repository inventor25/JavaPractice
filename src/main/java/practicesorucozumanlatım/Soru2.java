package practicesorucozumanlatım;

public class Soru2 {
    int price = 20000;
    int year = 2020;
    String make = "Honda";


//soru2



    public static void main(String[] args) {
        Soru2  hondaAraba = new Soru2();
        System.out.println(hondaAraba.price);
        System.out.println(hondaAraba.year - 3);
      //  int sonyil=hondaAraba.year-3;
       // System.out.println(sonyil);
        System.out.println(hondaAraba.make.replace("H", "K"));
    }
}
