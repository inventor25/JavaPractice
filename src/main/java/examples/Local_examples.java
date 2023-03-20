package examples;

import java.util.Scanner;

public class Local_examples {
    public static void main(String[] args) {

/*



        /*
        Example 2: Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
Teklif 80.000'in uzerinde ise “Kabul ediyorum”,
60-80.000 arasinda ise “Konusabiliriz”.
60.000'in altinda ise “Maalesef Kabul edemem” yazdirin.
         */
        Scanner input = new Scanner(System.in);


        System.out.println("maas teklifini giriniz");
        double teklif = input.nextDouble();

        if (teklif>80000) {
            System.out.println("kabul ediyorum");
        } else if (teklif>=60000 && teklif<=80000) {
            System.out.println("konusabiliriz");
        } else if (teklif < 60000 && teklif > 0) {
            System.out.println("maalesf kabul edemem");
        } else {
            System.out.println("lütfen gecerli bir maas giriniz");

        }

        /*
Example 3: Bir sifre giriniz
Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
 */

        System.out.println("Bir sifre giriniz");
        char sifre =input.next().charAt(0);

        if (sifre>='A' && sifre <= 'Z') {
            if (sifre == 'A') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }
        } else if (sifre>= 'z' && sifre <='z') {
            if (sifre == 'z') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre" );
            }

        }


                /*
Example 4: Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
i)Yil 100 e bolunursa 400 e de bolunmelidir. ==> 1600+ (artik yil) 1800-(artik yil degil)
ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil) 2001-(artik yil degil)

Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
 Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.
 Dört yılda bir gelen 366 günlük yil
 */
                    int artikYıl = 2022;
        if (artikYıl%100 ==0) {
            if (artikYıl%400 == 0) {
                System.out.println("artik yıl");
            } else {
                System.out.println("artik yıl değil");
            }

        } else if (artikYıl % 4 == 0) {
            System.out.println("artik yil");
        } else {
            System.out.println("artik yıl değil");
        }



        /*
Example 4: Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
i)Yil 100 e bolunursa 400 e de bolunmelidir. ==> 1600+ (artik yil) 1800-(artik yil degil)
ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil)  2001-(artik yil degil)

Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
 Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.
 Dört yılda bir gelen 366 günlük yil
 */
        int artilYili= 2000;
        String sonuc = artilYili%100==0 ? (artilYili%400==0 ? "Artik yil"  : "artik yıl değil" ):
                (artilYili%4==0 ? "artik yıl" : "artik yıl değil");
        System.out.println(sonuc);
/*
Example 6:
Kullanicidan gun ismini yazmasini isteyin.
Girilen isim gecerli bir gun ise gun isminin 1.,2.ve3.harflerini
ilk harf buyuk diger harflerini kucuk olarak yazdirin,
gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.
*/


        System.out.println("ekrana gün ismi giriniz");
        String gunNo = input.nextLine();
        if (gunNo.equalsIgnoreCase("pazar")) {
            System.out.println("PAZar");

        } else if (gunNo.equalsIgnoreCase("pazartesi")) {
            System.out.println("PAZartesi");
        }else if (gunNo.equalsIgnoreCase("sali")) {
            System.out.println("SALi");
        }else if (gunNo.equalsIgnoreCase("carsamba")) {
            System.out.println("CARsamba");
        }else if (gunNo.equalsIgnoreCase("persembe")) {
            System.out.println("PERsembe");
        }else if (gunNo.equalsIgnoreCase("cuma")) {
            System.out.println("CUMa");
        } else if (gunNo.equalsIgnoreCase("cumartesi")) {
            System.out.println("CUMartesi");
        } else {
            System.out.println("lütfen gecerli gün ismi girinz");
        }


    }
}
