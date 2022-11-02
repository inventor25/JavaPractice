package forloopslides01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoop02 {
    //200'den küçük ve 5'e bölünebilen sayma sayılarını ekrana yazdıran programı yazınız.
    // For-loop kullanarak konsolda.

    //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız. Örnek; 223878  ́ 37
    //20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk bırakarak yazdırmak için gereken kodu yazınız.
    //Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
    //Örneğin; 75.4238  ́ *4*2*3*8
    //Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
    // ardından isimdeki döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.(String name="John geç geldi") "e"
    /*
    Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız. Örnek: 2000 yılının Şubat ayında gün sayısı 29.
int ay = 2;
int yil = 2000;
int gunSayisi = 0;
switch (ay) {
case 1: case 3: case 5: case 7: case 8: case 10: case 12:
gunSayisi = 31;
break; case 4: case 6:
case 9: case 11: gunSayisi = 30;
break; case 2:
if (((yil % 4 == 0) && !(yil % 100 == 0)) || (yil % 400 == 0)) { gunSayisi = 29;
}else {
gunSayisi = 28;
}
break; default:
System.out.println("Gecersiz Ay");
break; }
System.out.println("Gun Sayisi = " + gunSayisi);
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*


            String a = "223878";
            for (int k = 0; k < a.length(); k++) {
                char ch = a.charAt(k);
                if (a.indexOf(ch)==a.lastIndexOf(ch)) {

                int donusturulmus = Character.valueOf(ch);
                    System.out.print(ch);
                }
            }
        System.out.println();

        for (int i =20; i>2; i--) {
            if (i%2!=0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i =0; i<201;i++) {
            if (i%5==0) {
                System.out.print(i+" ");
            }
        }



        //Örneğin; 75.4238  ́ *4*2*3*8
        double sayi = 75.4238;
        String yeni = String.valueOf(sayi);
        String bolunmus = yeni.split("\\.")[1];//4238



       for (int i =0;i<bolunmus.length(); i++) {
           char ch = bolunmus.charAt(i);
           System.out.print("*"+ch);



           }


        double sayi = 75.4238;
        String yeni = String.valueOf(sayi);
        String bolunmus = yeni.split("\\.")[1];//4238
        int i =0;

        do {
            char ch = bolunmus.charAt(i);

            i++;
            System.out.print("*"+ch);
        } while (i<bolunmus.length());



// 100 den baslayıp 50 ye kadar olan sayıları aralarında vırgul kulanarak ekrana yazdırın
        for (int i =100;i>49; i-- ) {
            System.out.print(i+",");
        }


        //2.yol while loop ile
        int i =100;
        while (i>49) {

            System.out.print(i+",");
            i--;
        }


        //3.yol do while loop
        int i =100;
        do {
            System.out.print(i+",");
            i--;

        } while (i>49);


//kullanıcıdan 100 den küçük sayı iste 1 den baslayarak 3 ün katı olanları yazdırın

        System.out.println("100 den küçük bir sayı giriniz...");
        int a = input.nextInt();
        a=Math.abs(a);
        if (a<101) {

            for (int i = 1; i < a+1; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");


                }


            }

        }else System.out.println("100 den küçük sayı girin");





        //Arkadaşlar selam  soruyu while loop ile çözdüm daha clear olanı varsa düzeltirmisiniz teşekkürler
        //Example : kullanıcıdan 100 den küçük sayı iste 1 den baslayarak 3 ün katı olanları yazdırın

        System.out.println("100 den küçük bir sayı giriniz...");
        int a = input.nextInt();
        int i = 1;
        a = Math.abs(a);
        if (a < 101 && a != 0) {

            while (i < a + 1) {
                if (i % 3 == 0) {

                    System.out.print(i + " ");

                }
                i++;





            }
        }






        System.out.println("100'den küçük bir sayı giriniz.");
        int girilenSayi = input.nextInt();
        int i = 1;

        do
        {
            if(i % 3 == 0){
                System.out.print(i + " ");}
                i++;

        }
        while(i < girilenSayi && girilenSayi<101 );


        System.out.println("Bir sayi giriniz");
        int sayı = input.nextInt();
        int i =1;
        do {
            if (i%3==0||i%5==0)

                System.out.print(i + " ");


              i++;
        } while (i<sayı && sayı<101);


        //100 den küçük sayı isteyin 1 den girilen sayıya kadar yazdırın 3 ün katı olanlara Java 5 in katı olanlara güzeldir yazdırın
        System.out.println("lütfen 100 den küçük sayı girin");
         int sayi = input.nextInt();
            sayi=101;

        for (int i=1; i<sayi+1; i++ ) {
            if (i%3!=0 && i%5!=0) {
                System.out.print(" "+i);
            } else if (i%3==0) {
                System.out.print(" java");
            } else if (i%5==0) {
                System.out.print(" güzeldir");

            }

        }




        System.out.println("bir sayi giriniz");

        int sayi = input.nextInt();
        int i =1;
        while (i<sayi+1) {
            if (i%3!=0 && i%5!=0) {

                System.out.print(i+" ");

            } else if (i%3==0 && i%5==0) {
                System.out.print("Java Güzeldir ");


            } else if (i%5==0) {
                System.out.print("güzeldir ");

            }  else if (i%3==0) {
                System.out.print("Java ");

            }
            i++;
        }


        System.out.println("bir sayı gir");
        int sayi = input.nextInt();


        for (int i = 1; i < sayi + 1; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java güzeldir");
            } else if (i % 3 == 0) {
                System.out.print("Java ");
            } else if (i % 5 == 0) {
                System.out.print("kolaydır ");

            }

        }




//Sour 7; bir string isteyin string i terz yazdırın
        System.out.println("lütfen bir cümle giriniz");

        String cumle = input.nextLine();
        String tersCumle ="";
        for (int i = cumle.length()-1;i>-1;i--) {
            tersCumle=tersCumle+cumle.substring(i,i+1);

        }
        System.out.print(tersCumle);



// Kullanıcıdan alinan kelimenin polidrom olup olmadığını yazdırın
        System.out.println("bir kelime yazın");
        String kelime = input.nextLine();
        String ters = "";
        for (int i = kelime.length() - 1; i > -1; i--) {
            ters = ters +kelime.substring(i,i+1);

        }
        if (kelime.equalsIgnoreCase(ters)) {
            System.out.println("polidrom");
        }else System.out.println("polidrom değil");




        //soru 10: kullanıcıdan 2 sayı isteyin girilen sayılar ve aralarında ki tüm sayılar toplayıp ekran yazdıran kodu yazınız
        System.out.println("lütfen bir sayı girin");
        double sayi1 = input.nextDouble();
        System.out.println("lütfen bir sayı daha girin");
        double sayi2 = input.nextDouble();
        double terim =sayi1>sayi2 ? (sayi1-sayi2)+1 : (sayi2-sayi1)+1;

        double terimTop=terim*((sayi1+sayi2)/2);

        System.out.println(terimTop);


        System.out.println("10'dan küçük bir sayı girin.");
             int sayi4 = input.nextInt();
             if(sayi4 > 10 && sayi4 < 1)
             {
               System.out.println("Girilen sayı 10'dan büyük veya 1'de küçük olduğu için sayı 10 yapıldı");
               sayi4 = 10;
             }

             for(int i = sayi4 - 1; i > 0; i--)
             {
               sayi4 =sayi4* i;
             }

             System.out.println("Girilen sayının faktoriyeli : " + sayi4);

         */
        System.out.println("bir sayı girin");
        int sayi = input.nextInt();
        if (sayi > 0 && sayi < 11) {

            for (int i = sayi - 1; i > 0; i--) {
                sayi = sayi * i;
            }
            System.out.println(sayi);
        } else System.out.println("hatalı sayı girdiiz");


    }
    }




















