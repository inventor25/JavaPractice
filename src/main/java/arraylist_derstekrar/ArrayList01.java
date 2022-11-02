package arraylist_derstekrar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
                //Example 1: kullanıcıdan olusturulan bir  List'teki elemanlardan birbirine en yakin olan ikisini bulup
                // en küçük farkı ekrana yazdırın
        Scanner input = new Scanner(System.in);
/*
        List<Integer> sayiList = new ArrayList<>();
        System.out.println("lütfen list size girniz");
        int size = input.nextInt();

      for (int i =0;i<=size;i++){
          System.out.println("lütfen bir integer değer giriniz");
          int sayi= input.nextInt();
          sayiList.add(sayi);

      }
        System.out.println(sayiList);
        Collections.sort(sayiList);
        System.out.println("kücükten büyüğe dizilim "+sayiList);
        int minFark= Integer.MAX_VALUE;

        for (int i=1;i<sayiList.size();i++) {
            minFark= Math.min(minFark, sayiList.get(i)- sayiList.get(i-1));
        }
        System.out.println(minFark);

 */


        //Example 1: kullanıcıdan alınarak olusturulan listte ki elemanlari tekrarsiz olarak yazınız
        //[2, 3, 2, 2, 5]==>[2,3,5]
        List<Integer> kume =new ArrayList<>();
        System.out.println("lütfen list uzunluğunu giriniz");
        int size01 = input.nextInt();

        for (int i=0; i<size01;i++){
            System.out.println("lütfen listin ilk elemanını giriniz");
            int eleman =input.nextInt();
            kume.add(eleman);

        }
        System.out.println(kume);
        Collections.sort(kume);
        System.out.println("büyükten küçüğe dizilmiş kume ="+kume);
        List<Integer> tekrarsiz=new ArrayList<>();

        for (int w:kume) {
            if (!tekrarsiz.contains(w)) {
                tekrarsiz.add(w);
            }
        }
        System.out.println(tekrarsiz);






    }


}

