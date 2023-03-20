package pastane_methodbasitpractice;

import java.util.Scanner;

public class PastaneSecim {
    public static String[] unluMamul = {"(1),Poğaça", "(2),Ekmek", "(3),Simit", "(4),Börek", "(5),Pasta", "(6),Baklava"};
    public static double[] mamulFiyat = {8, 5, 10, 75, 100, 170};
    static String birlikte = unluMamul[0] + " = " + mamulFiyat[0] + "₺ \n" + unluMamul[1] + " = " + mamulFiyat[1] + "₺ \n" + unluMamul[2]
            + " = " + mamulFiyat[2] + "₺ \n" + unluMamul[3] + " = " + mamulFiyat[3] + "₺ \n" + unluMamul[4] + " = " + mamulFiyat[4] + "₺ \n"
            + unluMamul[5] + " = " + mamulFiyat[5] + "₺";

    static Scanner input = new Scanner(System.in);
    static int max = Integer.MAX_VALUE;
    static int idx = 0;
    static int toplamTutar = 0;

    public static void urunSecimi() {
        System.out.println(birlikte);
        System.out.println("toplam Tutar = "+toplamTutar);
        idx();


    }


    public static void idx() {
        System.out.println("lütfen ürün kodunu giriniz  " + " çıkmak için = " + "0" + " kullanınız");
        idx = input.nextInt();
        System.out.println("lütfen miktar girinz");
        int mamulMiktar = input.nextInt();

        if (idx == 0) {
            System.out.println(toplamTutar);
        } else if (idx == 1) {
            toplamTutar += mamulMiktar * mamulFiyat[0];
            System.out.println(toplamTutar);
        } else if (idx == 2) {
            toplamTutar += mamulMiktar * mamulFiyat[1];
            System.out.println(toplamTutar);
        } else if (idx == 3) {
            toplamTutar += mamulMiktar * mamulFiyat[2];
            System.out.println(toplamTutar);

        } else if (idx == 4) {
            toplamTutar += mamulMiktar * mamulFiyat[3];
            System.out.println(toplamTutar);

        } else if (idx == 5) {
            toplamTutar += mamulMiktar * mamulFiyat[4];
            System.out.println(toplamTutar);
        } else if (idx == 6) {
            toplamTutar += mamulMiktar * mamulFiyat[5];
            System.out.println(toplamTutar);
        } else {
            System.out.println("Lütfen geçerli giriş yapınız");


        }

    }

    public static void main(String[] args) {
        for (int i=0;i<i+1;i++) {
            urunSecimi();
            if (idx==0) {
                break;
            }

        }

    }

}