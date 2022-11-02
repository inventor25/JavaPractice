package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Slides {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*

        String isimler []= new String[4];
        isimler [0]="Ali";
        isimler [1]="Veli";
        isimler [2]="Ayse";
        isimler [3]="Fatma";
        System.out.println(Arrays.toString(isimler));
        String isimler1 []={"Ali","Veli","Ayse","Fatma"};
        System.out.println(Arrays.toString(isimler1));

         Arrays.sort(isimler);
         isimler[0]="Can";
         isimler[1]="Ayse";
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.binarySearch(isimler,"Veli"));



        int arr [][] = new int[2][3];
        arr [0][0]=1;
        arr [0][1]=2;
        arr [0][2]=3;
        arr [1][0]=4;
        arr [1][1]=5;
        arr [1][2]=6;

        System.out.println(Arrays.deepToString(arr));



        int arr [][] ={{1,2,3},{4,5},{6}};
       int carpma = arr[0][2]*arr[1][1]*arr[2][0];
        System.out.println(carpma);

        int carpim=1;

        int brr [][] ={{1,2,3},{4,5,6}};

        for ( int []w: brr) {
            for (int k :w) {
               carpim=carpim*k;
            }
        }
        System.out.println(carpim);







        System.out.println();

        int crr[][] = {{1, 2, 3}, {4, 5}, {6}};
        int son = crr[0][2];
        int son01 = crr[1][1];
        int son02 = crr[2][0];
        System.out.println(son * son01 * son02);


            //Example 3:
        // Asağıdaki multidimensional array in iç arraylerinde ki son elemanların çarpımını ekrana yazdıran kodu yazınız
        //1.YOL
        int me[][] = {{1, 2, 3}, {4, 5}, {6}};
        int carpim = 1;
        for (int i = 0; i <me.length; i++) {
            for (int j = 0; j < me[i].length; j++) {
                if (j==me[i].length-1){
                    carpim = carpim*me[i][j];
                }
            }
        }
        System.out.println(carpim);



        //2.YOL
        int le [][] = {{1, 2, 4}, {4, 5}, {8,3}};

        int carpim01 =1;
        for (int i =0;i<le.length;i++) {
            carpim01 = carpim01*le[i][le[i].length-1];
            System.out.println(carpim01);
        }




        //Example aşağıda ki multidimensional array'lerin
        // iç array'lerin aynı index'e sahip elemanların toplamını ekrana yazdıran kodu yazınız
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        int toplam = 0;//8,10,13,15,18

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (j < arr1[i].length && j < arr2[i].length) {

                    toplam = arr1[i][j]+arr2[i][j];
                    System.out.print(toplam+" ");


                }




                }



//bir sayılar array inin tersten yeni array olarak yazılmasını gösteren kod for loop ile yapılması

        int[] sayilar = {1 ,2, 3};
        int[] yeni =new int[sayilar.length];
        int idx=0;
        for (int i = sayilar.length-1; i >-1 ; i--) {
            yeni[idx]=sayilar[i];
            System.out.println(Arrays.toString(yeni));
          idx++;

        }


            //bir sayılar array inin tersten yeni array olarak yazılmasını gösteren kod for each ile yapılması**************
        int[] sayilar = {1, 2, 3};
        int[] yeni = new int[sayilar.length];
        int idx = sayilar.length - 1;
        for (int w : sayilar) {
            yeni[idx] = w;
            idx--;


        }
        System.out.println(Arrays.toString(yeni));



        // SORU 1 İNGİLİZCE SLİDES: 1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
            //(for each ile çözüm)
        int ikili[] []={{1,2,3},{4,5,6}};
        int toplam =0;

        for (int []w:ikili) {
            for (int j:w) {
                toplam=toplam+j;

            }
        }
        System.out.println(toplam);


        // SORU 1 İNGİLİZCE SLİDES: 1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
        // **************for loop ile çözümü*********************

        int ikili[][] = {{1, 2, 3}, {4, 5, 6}};
        int toplam=0;
        for (int i = 0; i < ikili.length ; i++) {
            for (int k=0; k<ikili[i].length;k++) {
              toplam=toplam+ikili[i][k];

            }

        }

        System.out.println(toplam);



        //Verilen çok boyutlu dizinin { {1,2,3}, {4,5}, {6,7} } dizi öğelerindeki öğelerin toplamını bulun ve bir dizi döndürün.
        //Örneğin; { {1,2,3}, {4,5}, {6,7} } için çıktı {6, 9, 13} olacaktır



        int[][] sayilar1 = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] sayiToplam = new int[sayilar1.length];
        int i1 = 0;

        for(int[] w : sayilar1)
        {
            for(int k : w)
            {
                sayiToplam[i1] = sayiToplam[i1] +k;//1
                //toplam += k;
                System.out.println(Arrays.toString(sayiToplam));
            }


            i1++;
            System.out.println(Arrays.toString(sayiToplam));

        }

         */

        //Soru 5: Kullanıcıdan uzun iki cümle girmesini isteyin. Ardından cümlelerdeki tüm “kelimeleri” sayan bir program yazın.
        //Örneğin; kullanıcı girerse “Java kolay, eğer çalışırsan. Çalışmazsan hiçbir şey kolay değildir” çıktısı 14 olacaktır. İpucu: split() kullanın
        // aşağıdan geliyorum yüküm eritir. Erikin dalları deliktir.
        System.out.println("lütfen 2 tane cümle giriniz");
        String cumle1 = input.nextLine();
        String yeniCumle=cumle1.replaceAll("\\p{Punct}","");
        System.out.println(yeniCumle);
        String[] kelimeler1 = yeniCumle.split(" ");
        System.out.println(kelimeler1.length);
        int kelimeSayisi = 0;
        for(int i = 0; i < kelimeler1.length; i++)
        {
            System.out.println(kelimeler1[i]);
            kelimeSayisi++;
        }
        System.out.println(kelimeSayisi + " tane kelime vardır");





            }

        }










