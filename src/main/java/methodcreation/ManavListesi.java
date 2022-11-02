package methodcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManavListesi {
    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         *
    public static void main(String[] args) {

        String[] urunList = {"1) ELMA ", "2) DOMATES ", "3) SOGAN ", "4) YUMURTA  ", "5)EKMEK  "};
        Double[] fiyatList = {20.0, 18.0, 13.0, 25.0, 5.0};
        System.out.print(urunList[0] + " = " + fiyatList[0] + "₺\n" + urunList[1] + " = " + fiyatList[1] + "₺\n" + urunList[2] + " = " + fiyatList[2]
                + "₺\n" + urunList[3] + " = " + fiyatList[3] + "₺\n" + urunList[4] + " = " + fiyatList[4] + "₺\n");

        int max = Integer.MAX_VALUE;
        double kasa = 0;
        System.out.println("Seçimi bitirmek isterseniz Lütfen 'Q' harfine basınız");


        for (int i = 0; i < max; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Lütfen seçmek isdeğiniz ürün adını giriniz");
            String urunAdi = input.next().toUpperCase();
            if (urunAdi.equalsIgnoreCase("ELMA")) {
                System.out.println("Lütfen ürün kilogramini giriniz");
                Double urunMiktari = input.nextDouble();
                kasa += urunMiktari * fiyatList[0];
                System.out.println("Toplam tutar = " + kasa);
            } else if (urunAdi.equalsIgnoreCase("DOMATES")) {
                System.out.println("Lütfen ürün kilogramini giriniz");
                Double urunMiktari = input.nextDouble();
                kasa += urunMiktari * fiyatList[1];
                System.out.println("Toplam tutar = " + kasa);
            } else if (urunAdi.equalsIgnoreCase("SOGAN")) {
                System.out.println("Lütfen ürün kilogramini giriniz");
                Double urunMiktari = input.nextDouble();
                kasa += urunMiktari * fiyatList[2];
                System.out.println("Toplam tutar = " + kasa);
            } else if (urunAdi.equalsIgnoreCase("YUMURTA")) {
                System.out.println("Lütfen ürün kilogramini giriniz");
                Double urunMiktari = input.nextDouble();
                kasa += urunMiktari * fiyatList[3];
                System.out.println("Toplam tutar = " + kasa);
            } else if (urunAdi.equalsIgnoreCase("EKMEK")) {
                System.out.println("Lütfen ürün kilogramini giriniz");
                Double urunMiktari = input.nextDouble();
                kasa += urunMiktari * fiyatList[4];
                System.out.println("Toplam tutar = " + kasa);
            } else if (urunAdi.equalsIgnoreCase("Q")) {

                System.out.println("Toplam tutar = " + kasa);
                break;

            } else System.out.println("lütfen doğru giriş yapınız");


        }

    }


    static String[] meyveler = {" ", "Portakal", "Elma", "Muz", "Mandalina", "Kiraz"};
    static int[] fiyatlar = {0,20,10,30,15,25};
    static int toplam = 0;
    static  String satinAlinanlar = "";
    public static void main(String[] args) {

        System.out.println("*".repeat(40) + "\n0\t Cikis Yap\n1\t Portakal\t\t20 TL\n2\t Elma\t\t\t10 TL\n" +
                "2\t Muz\t\t\t30 TL\n4\t Mandalina\t\t15 TL\n5\t Kiraz \t\t\t25 TL");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Satin Almak Istediginiz Urunu Secin");
            int urun = input.nextInt();
            if (urun == 0){
                System.out.println("Cikis Yapiliyor");
                System.out.println("Satin Aldiginiz Urunler " + satinAlinanlar +" Odemeniz Gereken Toplam Miktar " + toplam + " TL");
                break;
            }else if (urun>5){
                System.out.println("Gecersiz Islem Lutfen Listeden Bir Secim Yapiniz");
                continue;
            }
            System.out.println("Kac Kilo almlak Istiyorsunuz");
            int miktar = input.nextInt();
            toplam += musteriSecimi(urun, miktar);
            satinAlinanlar += (meyveler[urun]) + " ";
        }while (true);


    }
    public static int musteriSecimi(int alinanUrun, int alinanMiktar){
        return fiyatlar[alinanUrun] * alinanMiktar;
    }

     */

    /*
    *********************eksik çözüm******************

        public static String[] urunList = {"1) ELMA ", "2) DOMATES ", "3) SOGAN ", "4) YUMURTA  ", "5)EKMEK  "};
        public static Double[] fiyatList = {20.0, 18.0, 13.0, 25.0, 5.0};
        public static double urunFiyati = 0;
        public static double urunMiktar = 0;
        public static double toplamTutar = 0;
        static int max = Integer.MAX_VALUE;

        public static double kasa(double girilenMiktar, double urunFiyati) {
            toplamTutar += girilenMiktar * urunFiyati;
            return toplamTutar;
        }

        public static Double musteriSecimi(String secilenUrun) {

            if (secilenUrun.equalsIgnoreCase("ELMA")) {
                urunFiyati = fiyatList[0];

            } else if (secilenUrun.equalsIgnoreCase("DOMATES")) {
                urunFiyati = fiyatList[1];
            } else if (secilenUrun.equalsIgnoreCase("SOGAN")) {
                urunFiyati = fiyatList[2];
            } else if (secilenUrun.equalsIgnoreCase("YUMURTA")) {
                urunFiyati = fiyatList[3];
            } else if (secilenUrun.equalsIgnoreCase("EKMEK")) {
                urunFiyati = fiyatList[4];
            } else if (secilenUrun.equalsIgnoreCase("Q")) {
                System.out.println(toplamTutar);

            }
            return urunFiyati;
        }

        public static void main(String[] args) {

            String[] urunList = {"1) ELMA ", "2) DOMATES ", "3) SOGAN ", "4) YUMURTA  ", "5)EKMEK  "};
            Double[] fiyatList = {20.0, 18.0, 13.0, 25.0, 5.0};
            System.out.print(urunList[0] + " = " + fiyatList[0] + "₺\n" + urunList[1] + " = " + fiyatList[1] + "₺\n" + urunList[2] + " = " + fiyatList[2]
                    + "₺\n" + urunList[3] + " = " + fiyatList[3] + "₺\n" + urunList[4] + " = " + fiyatList[4] + "₺\n");


            for (int i = 0; i < max; i++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Lütfen seçmek isdeğiniz ürün adını giriniz");
                String alinacakUrun = input.next();
                System.out.println("Lütfen ürün kilogramini giriniz");
                Double urunMiktari = input.nextDouble();
                musteriSecimi(alinacakUrun);
                kasa(urunMiktari, urunFiyati);
                System.out.println(alinacakUrun + " " + urunMiktari + " " + toplamTutar);


            }
        }

     */
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("patates - urun kodu : 1", "limon - urun kodu : 2", "kivi - urun kodu : 3",
            "biber - urun kodu : 4", "patlican - urun kodu : 5"));//urunlerin atanacagi bos list ve diger methodlarda da kullanabilmek icin instance yaptik.
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0, 7.5, 1.3, 8.7, 9.2));//urun fiyatlarinin atanacagi bos list ve instance variable.

    static double toplamOdenecekTutar;//instance variable
    static Scanner scan = new Scanner(System.in);//instance variable

    public static void main(String[] args) {

        System.out.println(urunListesi);
        musteriSecim();
    }

    private static void musteriSecim() {

        System.out.println("hangi urunu secmek istersiniz :");
        int secim = scan.nextInt();

        System.out.println("sectiginiz urunden kac kilo alacaksiniz : ");
        double kilo = scan.nextDouble();
        double urunTutari = urunFiyatlari.get(secim - 1);//urun listesi 1'den 5'e kadar. Or. musteri 5. urunu secti, fiyatina ulasmak icin 4. index'e gitmek lazim.
        //bu nedenle -1 yapiyoruz.
        double urunToplamTutar = kilo * urunTutari;//1.3
        toplamOdenecekTutar += urunToplamTutar;//alınan her urun odemesi ana odemeye eklendi
        System.out.println("devam edecekseniz 1, kasa için 2 seciniz...");
        kasa();


        int karar = scan.nextInt();
        if (karar == 1) {
            musteriSecim();
        } else if (karar == 2) {
            kasa();
        } else if (karar != 1 && karar != 2) {
            System.out.println("lütfen geçerli giriniz");
            musteriSecim();
        }

    }


    private static void kasa() {

        System.out.println("alisverisinizin toplam tutari : " + toplamOdenecekTutar);
    }

}


