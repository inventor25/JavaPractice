package exceptions01;

public class exception01 {
    public static void main(String[] args) {


        stringToInteger("123");

        //stringToInteger("12a"); (NumberFormatException e) gösterimi

        fromStringChar("ahmet",2);

       // fromStringChar("ahmet" , 6); //Index ile ilgili bir problem olustu. String index out of range: 6







    }


    public static void stringToInteger(String abc) {
        int i = 0;


        try {
            i = Integer.valueOf(abc);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilemez");
        }

    }


    public static void fromStringChar(String a, int idx) {
        char c = ' ';

        try {
            c = a.charAt(idx);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index ile ilgili bir problem olustu. "+ e.getMessage());
            e.printStackTrace();//Detayli "log" icin
        }



    }

}
