package sumeyyehoca;

import java.util.Scanner;

public class SumeyyeHocaPractice {
    public static void main(String[] args) {


        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int adet=scan.nextInt();
        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
        double fiyat=scan.nextDouble();
        System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
        char kart=scan.next().toLowerCase().charAt(0);
        double toplamFiyat;
        if(kart=='y'){
            if(adet>10){
                fiyat*=0.8;//fiyat=fiyat*0.8
                toplamFiyat=fiyat*adet;
                System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "+toplamFiyat+" TL dir");
            }else{
                fiyat*=0.85;
                toplamFiyat=fiyat*adet;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gerekn miktar: "+toplamFiyat+" TL dir");
            }


        } else if (kart=='n') {
            if(adet>10){
                fiyat*=0.85;
                toplamFiyat= fiyat*adet;
                System.out.println("%15 indirim hakki kazandiniz.Toplam odemeniz gereken miktar:"+toplamFiyat+" TL dir");
            }else{
                fiyat*=0.9;
                toplamFiyat=fiyat*adet;
                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "+toplamFiyat+" TL dir");
            }

        }else{
            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz.");
        }




            /*
    SORU: Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

        Scanner input = new Scanner(System.in);
        System.out.println("     ****    ");
        System.out.println("ATM 'ye hosgeldiniz :-)  ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatirma : 3\ncikis : 4");
        int islem=input.nextInt();
        int bakiye=1000;

        switch(islem){
            case 1:
                System.out.println("Mevcut bakiyeniz: "+ bakiye);
                break;
            case 2:
                System.out.println("Cekeceginiz miktari giriniz: ");
                int cekilenMiktar=input.nextInt();
                if(cekilenMiktar>bakiye || cekilenMiktar<0){
                    System.out.println("Olmayan parayi cekmeye calisiyorsunuz.");
                }else{
                    bakiye-=cekilenMiktar;
                    System.out.println("Bakiyenizin guncel hali :  "+bakiye);
                }
                break;
            case 3:
                System.out.println("Yatiracaginiz miktari giriniz : ");
                int yatirilanMiktar= input.nextInt();
                bakiye+=yatirilanMiktar;
                System.out.println("Bakiyenizin guncel hali : "+bakiye);
                break;
            case 4:
                System.out.println("Cikisiniz yapilmistir. Yine bekleriz :-)");
                break;


        }






/*
    Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız.
     Google'dan dönüşümler için formülleri bulunuz.
    a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
    b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
    kodunuz "2" yazmalıdır (sayı dinamik olacak)
    c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
    konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

     */

        System.out.println("Mil dönüştürmek için 1, Saniye dönüştürmek için 2, Fahrenheit dönüştürmek için 3'e basınız");
        int secim2 = input.nextInt();
        if (secim2 == 1) {
            System.out.print("Mil'i dönüştürmek için değer giriniz: ");
            double mil = input.nextDouble();
            double mildenKmye = 1.60934 * mil;//bir mil= 1,60934 kilometredir.
            System.out.println("Girdiginiz mil degeri : "+mildenKmye +" km'dir.");
        } else if (secim2 == 2) {
            System.out.print("Saniye'yi dönüştürmek için değer giriniz: ");
            int saniye = input.nextInt();
            int saniyedenSaate = saniye / 3600;
            System.out.println("Girdiginiz saniye degeri : "+saniyedenSaate+ "  saat'dir.");
        } else if (secim2 == 3) {
            System.out.print("Fahrenheit'ı dönüştürmek için değer giriniz: ");
            double fahrenheit = input.nextDouble();
            double fahrenheitToCelcius =(fahrenheit - 32) / 1.8;
            fahrenheitToCelcius=Math.round(fahrenheitToCelcius);
            System.out.println("Girdiginiz fahrenayt'in degeri : "+fahrenheitToCelcius +" Celcius'dur. ");
        } else {
            System.out.println("Lütfen geçerli bir seçim yapın...");
        }

    }
}





