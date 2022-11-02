package arraylist_derstekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//Example 2: Kullanicidan şehir isimleri sorun, şehir ismi sizde ki
// List'in içinde varsa o şehri "Bulundu" ya ceviriniz yoksa o şehiri List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //        [A, K, R, S]  ==> X  ==> [A, K, R, S, X]
        List<String> cities =new ArrayList<>();
        cities.add("İSTANBUL");
        cities.add("ANKARA");
        cities.add("MUŞ");
        cities.add("ERZURUM");
        cities.add("RİZE");
        cities.add("DİYARBAKIR");

String degistirilen="";
        System.out.println("oyunu bitirmek için 'Q' Harfini kullanın ");
        do {
            System.out.println("Lütfen bir şehir ismi giriniz");
            String girilen= input.nextLine().toUpperCase();
             degistirilen = girilen.split(" ")[0];
            if (cities.contains(degistirilen)) {
                cities.set(cities.indexOf(degistirilen),"Bulundu" );

            } else if (!degistirilen.equals("Q")) {
                cities.add(degistirilen);
            }

        } while (!degistirilen.equals("Q"));
        System.out.println(cities);


        /*
        System.out.println();
        // 5  şehirden  list oluşturun ardından kullanıcıdan şehir isimleri isteyin eğer bu şehir ismi listte varsa
        //bu şehrin ismini listeden silin ve list boş olana kadar tekrar isteyin 20 hak verin eğer bilemezse kazanamadın tekrar oyna, listte
        // ki şehirleri doğru bilir ve bitirirse kazandın yazdırın
        List<String> cities = new ArrayList<>();
        cities.add("İSTANBUL");
        cities.add("ANKARA");
        cities.add("RİZE");
        cities.add("KARS");
        cities.add("İZMİR");

        int sayac = 20;
        String degistirilen = "";
        do {

            System.out.println("Lütfen bir şehir ismi giriniz");
            String girilen = input.nextLine().toUpperCase();
            degistirilen = girilen.split(" ")[0];

            if (sayac > 0) {
                sayac--;
                if (cities.contains(degistirilen)) {
                    cities.remove(degistirilen);


                } else if (!cities.contains(degistirilen)) {


                }
            }
            if (sayac == 0) {
                System.out.println("hakkınız bitti kaybettiniz\n tekrar oynamak için 1 çıkmak için herhangi bir rakama basınız");
                int secenek = input.nextInt();
                if (secenek == 1) {
                    sayac = 20;
                    girilen = input.nextLine().toUpperCase();
                } else {
                    System.out.println("Yine oynamaya bekleriz");
                    break;
                }
            }
            if (cities.isEmpty()) {
                System.out.println("Harika bir oyun çıkardınız *******TEBRİKLER KAZANDINIZ");
                break;
            }

            System.out.println(sayac + " hakkınız kaldı");
        } while (!cities.isEmpty());

         */


    }
}