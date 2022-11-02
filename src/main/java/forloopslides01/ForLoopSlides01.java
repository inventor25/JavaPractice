package forloopslides01;

import java.util.Scanner;

public class ForLoopSlides01 {


    //Example 1 ekrana 10 kere Java güzeldir yazdırın
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println("Java güzeldir");
        }

        //Example 2: 10dan baslayıp 30 a kadar sayıları virgül kullanarak ekrana yazdırın
        for (int i = 10; i < 31; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
        //Example 2: 100 den baslayarak 50 ye kadar olan sayıları virgül kullanrak aynı satırda yazdırın
        for (int i = 100; i > 49; i--) {
            System.out.print(i + ",");
        }
        System.out.println();

//kullanıcıdan 100 den kücük tamsayı isteyin ve 1 den baslayarak girilen sayiya kadar 3  katı olanları ekrana yazdırın
        Scanner input = new Scanner(System.in);
       // System.out.println("lütfen 100 den küçük bir sayi giriniz");
        //int sayi = input.nextInt();
        //sayi= Math.abs(sayi);
        //for (int i = 0; i < sayi+1; i++) {

          //  if ( i %3==0 || i%5==0) {
            //    System.out.print(i+ " ");


            //}
       // }

      //  Kullanicidan 100'den kucuk bir tamsayi isteyin.
        //1'den başlayarak girilen sayiya kadar tum sayilari yazdirin.
        //Ancak;
        //-şayi 3'un kati ise şayi yerine "Java" yazdirin.
          //      -şayi 5'in kati ise şayi yerine "Güzeldir" yazdirin.
            //    -şayi hem 3'un hem 5'in kati ise şayi yerine "Java Güzeldir" yazdirin.


            System.out.println("100'den küçük, 0'dan büyük bir sayı giriniz");
             byte sayi1 = input.nextByte();
             boolean ucunKatiMi, besinKatiMi;
            String mesaj1 = "", kelimeJava = "Java", kelimeGuzeldir = "Guzeldir";

             if(sayi1 < 100 && sayi1 > 0)
             {
               for(int i = 1; i < sayi1; i++)
              {
                 ucunKatiMi = i % 3 == 0;
                besinKatiMi = i % 5 == 0;

                 if(ucunKatiMi && besinKatiMi)
                   mesaj1 = kelimeJava + " " + kelimeGuzeldir;
                 else if(ucunKatiMi)
                  mesaj1 = kelimeJava;
               else if(besinKatiMi)
                  mesaj1 = kelimeGuzeldir;
                else
                  mesaj1 = i + "";
               System.out.println(mesaj1);
              }
            }
            else
               System.out.println("Sayı 100'den küçük olmalı ve 0'dan büyük olmalı.");



    }}


