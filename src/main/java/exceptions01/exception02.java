package exceptions01;

public class exception02 {
    public static void main(String[] args) {
        bolme(5, 4);

        // bolme(5,0);

        length("ahmet");
        // length(null); string boş olduğunda lentgh alınırsa  NullPointerException atar

        retirementAge(70);
        //retirementAge(101);  //IllegalArgumentException


    }


    public static void bolme(int a, int b) {

        try {
            int sonuc = a / b;
            System.out.println(sonuc);
        } catch (ArithmeticException e) {
            System.out.println("0 sayısı bölen olamaz" + e.getMessage());
            e.printStackTrace();
        }


    }

    public static void length(String str) {


        try {
            int a = str.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

    public static void retirementAge(int age) {

        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Yas negatif olamaz veya 100 den buyuk olamaz");
        } else if (age > 65) {
            System.out.println("emeklisen ");
        }
    }


}

