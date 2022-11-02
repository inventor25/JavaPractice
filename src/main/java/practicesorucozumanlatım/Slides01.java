package practicesorucozumanlatım;

import java.util.Scanner;

public class Slides01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




/*
        //Auto Widening Casting
        byte num01=12;
        short num02 =num01;
        System.out.println("num02= "+ num02);


        short num03 =23;
        int num04 = num03;
        System.out.println("num04 = "+num04);

        // Explicit Narrowing
        short num05 =12;
        byte num06 =(byte)num05;
        System.out.println("num06 = " + num06);

        double num07=45.678;
        int num08 = (int)num07;
        System.out.println("num08 = " + num08);


        short num09 = 255;//byte içerinde ki sayıya tamamlar 256
        byte num10=(byte)num09;
        System.out.println("num10 = " + num10);

           

            //data types

        int num1 =5/3;
        System.out.println("num1 = " + num1);
        float num2 =5F/3f;
        System.out.println("num2 = " + num2);
        double num3 =(5D/3);
        System.out.println("num3 = " + num3);


        //Soru 1 :Kenar uzunluğu kullanıcı tarafından girilen bir karenin alanını ve çevresini hesaplayan bir program yazın.
        System.out.println("Karenin bir kenar uzunluğunu gir");
        int a =input.nextInt();
        int alan = a*a;
        int çevre = 4*a;
        System.out.println("karenin alanı=  " + alan +"karenin çevresi"+ çevre);
        System.out.println("karenin alanı ="+ a*a + "karenin çevresi=" + 2*(a+a));





        //İpucu 1: Bir karenin alanı uzunluk x uzunluktur
        //İpucu 2: Bir karenin çevresi 4x uzunluktur




        //Sour 2: Yarıçapı kullanıcı tarafından girilen bir dairenin alanını ve çevresini hesaplayan bir program yazın. (şamandıra kullanın)
        //İpucu 1: Pi sayısını 3.14159 olarak alın
        //İpucu 2: Bir dairenin alanı 3.14159 x yarıçap x yarıçaptır
        //İpucu 3: Bir dairenin çevresi 2 x 3.14159 x yarıçaptır. İpucu 4: Yüzdürmek için nextFloat() kullanın

        System.out.println("lütfen dairenin yarıçapını giriniz..");
        float r = input.nextFloat();
        float daireninAlanı =(3.14159F*r*r);
        float dairenCevresi =(2*3.14159F*r);
        System.out.println("dairenin alanı = "+ daireninAlanı+ " "+ "dairenin cevresi= " +  dairenCevresi);


        //Soru 3: Saatleri saniyeye çeviren bir program yazın. Saat değeri kullanıcı tarafından girilecektir. (Uzun kullanın)
        //İpucu 1: saniye = saat x 60 x 60
       //İpucu 2: Uzatmak için nextLong() kullanın
        System.out.println("lütfen saat degeri girin");
        long saat = input.nextLong();
        long saniye = saat*60*60;
        System.out.println("saniye = " + saniye);
        
        



         //Soru 4
        int numC = 7 ; numC++ ;                                //int numD = 11 ; numD++ ;
        int numa =8;
        numa++;
        System.out.println(numC);                                                  //numD = ?
        System.out.println(numa);
        int nume=10;
        nume= nume+4;//14
        nume+=4;//18
        nume-=5;

        System.out.println(nume);
        int num13 = 20;
        num13--;
        System.out.println(num13);


       // int numE = 11 ; numE - - ;
        //int numD = 7 ; numD - - ;
        //numD = ?
       // numE = ?

        String str1 = "Learn"+ "Java";
        //str1 = ?
        String str4 = "2" + "5" ;
        //str4 = ?

        String str5 = 2 + 3 + "4" ;
        //str5 = ?
        String str2 = "Learn" +"" + "Java";
        //str2 = ?

        String str3 = "Learn " + "Java";
        //str3 = ?
        String str6 = "2" + (5 + 1) ;

 */

/*
      Soru 5 :Kullanıcıdan bir dörtgenin uzunluk ve genişlik değerlerini girmesini isteyin,
       ardından kare olup olmadığını kontrol edin.


        System.out.println("dörtgenin uzunluk değerini giriniz ");
        int uzunluk = input.nextInt();
        System.out.println("dörtgenin genislik degerini giriniz");
        int genislik = input.nextInt();

        if (uzunluk == genislik) {
            System.out.println("bu bir karedir");

        } else {
            System.out.println("bu bir kare degildir");
        }




        //Soru 6: Kullanıcıdan bir karakter girmesini isteyin, ardından karakterin alfabe olup olmadığını kontrol edin

        System.out.println("Lütfen bir karakter giriniz");
        char karakter =input.next().charAt(0);
        if (karakter >='a'&& karakter<='z' ) {
            System.out.println("bu bir harf");
        } else if (karakter>='A'&& karakter<='Z') {
            System.out.println("bu bir harf");

        }else {
            System.out.println("bu bir harf değil");

        }




        //Soru 7:Kullanıcıdan haftanın herhangi bir adını girmesini isteyin, ardından gün adının ikinci, dördüncü ve altıncı harfini alın ve aynı satırda konsolda yazdırın.
        //Örneğin; kullanıcı "Pazartesi" girerse çıktı "ody" olur
        System.out.println("lütfen bir gün ismi giriniz");
        String gün =input.next();
        char ch01 = gün.charAt(1);
        char ch = gün.charAt(3);

        System.out.print(ch01 +" "+ ch);




        //Soru 8 : if-else deyimini kullanarak java kodunu yazın,
        //Kullanıcı tarafından girilen bir sayının mutlak değerini ekrana yazdıran programı yazınız. Mutlak Değer: Sayı pozitif veya sıfır ise sayının kendisini döndür
        //Sayı negatifse, -1 ile çarptıktan sonra sayıyı döndürün.
        System.out.println("lütfen tam sayı giriniz");
        int sayı = input.nextInt();
        if (sayı == 0 || sayı > 0) {
            System.out.println(sayı);
        } else if (sayı < 0) {
            System.out.println(sayı * -1);
        }

 *
        System.out.println("lütfen tam sayı giriniz");
        int sayı = input.nextInt();
             sayı=Math.abs(sayı);
        System.out.println(sayı);




        //Soru 9:if-else deyimini kullanarak java kodunu yazın.
        //Bir mağaza, satın alınan miktarın maliyeti 1000'den fazla ise %10 indirim yapacaktır.
        //Kullanıcıdan miktar ve birim fiyatı isteyin, ardından kullanıcı için toplam maliyeti değerlendirin ve yazdırın.
        //Miktar 1000'den azsa çıktı "İndirim yok" olacaktır.
        System.out.println("lütfen alışveriş tutarını giriniz");
        double tutar =input.nextDouble();
        if (tutar>=1000) {
            System.out.println("indirim sonunda ödenecek tutar=  " +tutar*90/100);

        } else if (tutar<1000) {
            System.out.println("indirim tutarına ulaşmadınız indirim yapılmadı");

        }
/*

 */

        //Soru 10; if-else if() deyimini kullanarak Java kodunu yazın.
        //if-else if() deyimini kullanarak Java kodunu yazın,
        //13 yaşından küçük ise “Çalışmamalı”, 65 yaşından büyük ise “Emekli”, Aksi takdirde; çıktı "Çalışmalı" olacaktır
        // Bir okulun not sistemi için aşağıdaki kuralları vardır:
        System.out.println("lütfen yaşınız giriniz");
        int yas = input.nextInt();
        if (yas<=13) {
            System.out.println("yasınız 13 den küçük çalışamazsın");
        } else if (yas>=65) {
            System.out.println("tebrikler emeklisiniz");

        } else if (yas>13 && yas<65) {
            System.out.println("emekli olmak için  " +  (65-yas) +" yıl daha çalışmalısınız");

        }else System.out.println("lütfen geçerli yas girin");


        // 1. 50 - D 2. 50 - 59 - C 3. 60 - 80 - B. 4. 80 - 100 - A
        // Kullanıcıdan işaretleri girmesini ve ilgili notu yazdırmasını isteyin.




    }

}

