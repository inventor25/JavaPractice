package Inheritancepractice;

import java.util.Scanner;

public class UrunMaliyet extends DepoUrunler {
  static Scanner input = new Scanner( System.in);

     static void un01Maliyet() {

        System.out.println("Un ismini giriniz");
        un01Isim =input.nextLine();
        if (un01Isim.equalsIgnoreCase("Hekimoğlu")) {
            System.out.println("un miktarını çuval giriniz");
            un01Miktar= input.nextInt();
            System.out.println("un fiyatını tl giriniz");
            un01Fiyat = input.nextDouble();
           un01Maliyet=maliyetHesaplama(un01Miktar,un01Fiyat);
            System.out.println("Un Maliyeti : "+un01Maliyet);
        }

    }
    static void un02Maliyet() {

        System.out.println("Un ismini giriniz");
        input.nextLine();
        un02Isim =input.nextLine();
        if (un02Isim.equalsIgnoreCase("Tekbaş")) {
            System.out.println("un miktarını çuval giriniz");
            un02Miktar= input.nextInt();
            System.out.println("un fiyatını tl giriniz");
            un02Fiyat = input.nextDouble();
            un02Maliyet=maliyetHesaplama(un02Miktar,un02Fiyat);
            System.out.println("Un Maliyeti : "+un02Maliyet);
        }

    }
    static void yag01Maliyet() {

        System.out.println("Yağ ismini giriniz");
        yag01Isim =input.nextLine();
        if (yag01Isim.equalsIgnoreCase("Alba")) {
            System.out.println("Yağ miktarını kg olarak giriniz");
            yag01Miktar= input.nextInt();
            System.out.println("Yağ fiyatını tl giriniz");
            yag01Fiyat = input.nextDouble();
            yag01Maliyet=maliyetHesaplama(yag01Miktar,yag01Fiyat);
            System.out.println("Yağ Maliyeti : "+yag01Maliyet);
        }

    }
    static void yag02Maliyet() {

        System.out.println("Yağ ismini giriniz");
        yag02Isim =input.nextLine();
        if (yag02Isim.equalsIgnoreCase("Bizim")) {
            System.out.println("Yağ miktarını kg olarak giriniz");
            yag02Miktar= input.nextInt();
            System.out.println("Yağ fiyatını tl giriniz");
            yag02Fiyat = input.nextDouble();
            yag02Maliyet=maliyetHesaplama(yag02Miktar,yag02Fiyat);
            System.out.println("Yağ Maliyeti : "+yag02Maliyet);
        }

    }

   static double maliyetHesaplama (int a,double b) {
       double maliyet = a*b;
         return maliyet;
    }



}
