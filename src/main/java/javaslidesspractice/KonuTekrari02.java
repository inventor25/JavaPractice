package javaslidesspractice;

import java.util.Arrays;
import java.util.Scanner;

public class KonuTekrari02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*

        // Kullanicadan aldiginiz kelimemnin ilk ve son harfini ekrana yazdiriniz

        System.out.println("ekrana harflerden oluşan bir kelime yaziniz...");
        String kelime = input.next();
        String ilkHarf = kelime.substring(0,1);
        String sonHarf = kelime.substring(kelime.length()-1);
        String sonuc = (ilkHarf+sonHarf);
        System.out.println(sonuc);


    String bolum = "naber, canim";
    String ilk = bolum.substring(6, 12);
        System.out.println(ilk);

         */
        //"oku oku da adam ol baban gibi, essek olma" ""baban" ve "gibi" kelimelerini yan yana yazdırın
        //adam ol split kullarak yazdır
      //  System.out.println("oku oku da adam ol baban gibi, essek olma");
      //  String cumle = "oku oku da adam ol baban gibi, essek olma";
      //  String bolunmus = (cumle.substring(18, 24) + cumle.substring(24, 29));
      //  System.out.println(bolunmus);
      //  String yeniCumle = cumle.replaceAll("o", "O");
      //  System.out.println(yeniCumle);
      //  int num = yeniCumle.replaceAll(" ", "").length();
      //  System.out.println(num);
//
      //  String yaz = yeniCumle.replaceAll("oku", "yaz");
        //
      //  System.out.println(yaz);

        int[] arr1 ={1,2,3};
        int[] arr2 ={1,2,3};

        System.out.println(arr1==arr2);
        System.out.println(arr1==arr1);
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(arr1.equals(arr2));


    }

}
