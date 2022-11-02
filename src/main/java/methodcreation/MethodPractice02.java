package methodcreation;

import java.util.Scanner;

public class MethodPractice02 {


//Tek bir string ifade ile Array olusturup ekleme methodu girilen stringi bütün idexlere ekler
// public static String[] dersleriYazdırma (String b){

//    String [] dersler = new String[4];
//     dersler[0]=b;
//     dersler[1]=b;
//     dersler[2]=b;
//     dersler[3]=b;


//     return dersler;
// }

// public static void main(String[] args) {
//     String k = "matematik";

//     System.out.println(Arrays.toString(dersleriYazdırma(k)));

//    }


    //Tek bir string ifade ile Array olusturup ekleme methodu girilen stringi bütün idexlere ekler VOİD method ile
// public static void isimler(String a) {
//     String[] adlar = new String[4];
//     adlar[0] = a;
//     adlar[1] = a;
//     adlar[2] = a;
//     adlar[3] = a;

//     System.out.println(Arrays.toString(adlar));
// }

// public static void main(String[] args) {
//     String isim = "ahmet";
//     isimler(isim);

// }


    // //bir mutimimensional array'in iç elemanları toplamını veren method
    // public static void sayilar(int a, int b, int c, int t, int z) {
    //     int sayilar[][] = {{a, b, c}, {t, z}};

    //     int toplam = 0;
    //     for (int[] w : sayilar) {
    //         for (int k : w) {
    //             toplam += k;
    //             System.out.println(toplam);
    //         }
    //     }

    // }

    // public static void main(String[] args) {
    //     int sayilarr[][] = {{1, 2, 3}, {4, 5}};

    //     sayilar(1, 2, 3, 4, 5);
    // }

//public static void elemanarCarpim (int a, int b) {
//    int carpim=a*b;
//    System.out.println(carpim);

//}
//public static void elemanarCarpim (int a,int b) {

//    int carpim =a*b;
//    System.out.println(carpim);
//    //bunu int'e cevir sonra mainde yazılan methodla tekrar 15 sayısını carp
    //ayni method olursa java hata verir
//    //yani void ile int method arasında ki farkı gör

//}

//public static void main(String[] args) {
//    int a=15;
//    int b =20;
//    int c =12;
//
//}

    //kullanıcıdan aldığınız gün sayısını gün olarak yazdıran method olusturun

    // public static void gunleriYazdırma() {
    //     Scanner input =new Scanner(System.in);
    //     System.out.println("Lütfen bir gün numarası giriniz");
    //     int gunNo= input.nextInt();
    //     switch (gunNo){
    //         case 1:
    //             System.out.println("Pazartesi");
    //             break;
    //         case 2:
    //             System.out.println("Salı");
    //             break;
    //         case 3:
    //             System.out.println("Çarşamba");
    //             break;
    //         case 4:
    //             System.out.println("Perşembe");
    //             break;
    //         case 5:
    //             System.out.println("Cuma");
    //             break;
    //         case 6:
    //             System.out.println("Cumartesi");
    //             break;
    //         case 7:
    //             System.out.println("Pazar");
    //             break;
    //         default:
    //             System.out.println("lütfen geçerli giriş yapınız");


    //     }

    // }
    //
    // public static void main(String[] args) {
    //     gunleriYazdırma();
    // }


    //gün numaralarını kullanıcıdan alan ve gün isimleri için ayrı bir method olan program yazınız
    // 1.method günNo=1,..... ve 2.method günNo=1 se diğer method pazartesi versin


    public static int gunNo(int a) {
        int[] gunNo = {1, 2, 3, 4, 5, 6, 7};

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen gün numarası giriniz");
        int gunNumasi = input.nextInt();
        if (gunNumasi == 11) {
            System.out.println("görüşmek üzere");

        } else if (gunNumasi <= 0 || gunNumasi > 7) {
            return gunNo(0);

        }

        return gunNumasi;
    }

    public static void gunAdlari() {
        String[] gunIsimleri = {"Pazatesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
        int gecis = 0;

        int a = gunNo(gecis);


        for (int i = 1; i < i + 1; i++) {

            if (a == 11) {
                break;
            }

            System.out.println(gunIsimleri[a - 1]);
            break;
        }


    }


    public static void main(String[] args) {
        System.out.println("Çıkmak için '11' yazın");

        gunAdlari();

    }


}