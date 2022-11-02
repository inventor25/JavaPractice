package javaslidesspractice;



import java.util.Scanner;

public class KonuTekrari01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         /*
        String ilk = input.next();

        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk +" "+ orta + " " + soy);
        System.out.println(kimlik);*/


        // kullanicidan kimlik, password, plaka kodu ve ülkesini alıp asagida ki formatta ekrana yazdiriniz
        /*
        12345  a9876   34
             türkiye
         */
        /*
            Scanner input =new Scanner(System.in);
        String soru = "sırasıyla kimlik no,password,plaka kodu ve ülke ismini giriniz..";
        System.out.println(soru);
        String kimlikNo = input.next();
        String password = input.next();
        String plakaKodu = input.next();
        String ülkeIsmi = input.next();
        String tamCumle = (kimlikNo +" "+ password+" "+ plakaKodu);
        System.out.println(tamCumle);
        System.out.println(" " +ülkeIsmi);*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine();

        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);
        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);



            // kullanicidan aldiginiz sayinin ondalikli olup olmadigini ekrana yazdiran kodu yaziniz
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi gir kardeş");
        double x = input.nextDouble();
        if (x%2>0){
            System.out.println("efferin this bir ondalikli sayi");
        }else{
            System.out.println("ola neyittin bu tam sayidir");
        }


        // Kullaci ay numarisi girsin kod ay ismi yazsin
        Scanner input = new Scanner(System.in);
        System.out.println("kafandan bir ay numarasi gir...");
        byte ayNumarasi = input.nextByte();

        if (ayNumarasi==1) {
            System.out.println("ocak canim");
        }
        else if (ayNumarasi ==2) {
            System.out.println("subat canim");
        }
       else if (ayNumarasi ==3) {
            System.out.println("mart kapidan baktirir canim");
        }
        else if (ayNumarasi ==4) {
            System.out.println("nisan canim");
        }
        else if (ayNumarasi ==5) {
            System.out.println("mayis canim");
        }
        else if (ayNumarasi ==6) {
            System.out.println("haziran canim");
        }
        else if (ayNumarasi ==7) {
            System.out.println("temmuz canim");
        }
        else if(ayNumarasi==8){
            System.out.println("agustos canim");}
        else if(ayNumarasi==9){
            System.out.println("eylül canim");}
        else if(ayNumarasi==10){
            System.out.println("ekim canim");}
        else if(ayNumarasi==11){
            System.out.println("kasim canim");}
        else if(ayNumarasi==12){
            System.out.println("aralik canim");
        }else{
            System.out.println("zırtoluk etme bak düzgün sayi gir");
        }

*/
        /*
        KIŞ =ARALIK, OCAK , ŞUBAT
        İLKBAHAR = MART, NİSAN, MAYIS
        YAZ = HAZİRAN, TEMMUZ, AGUSTOS,
        SONBAHAR= EYLÜL, EKİM, KASIM
         */
        /*


        System.out.println(" bir ismi numarasi girin...");
        String ay = input.nextLine();
        boolean kıs = ay.equalsIgnoreCase("ARALIK") ||
                ay.equalsIgnoreCase("OCAK") ||
                ay.equalsIgnoreCase("SUBAT");
        boolean ilkbahar = ay.equalsIgnoreCase("mart") ||
                ay.equalsIgnoreCase("nisan") ||
                ay.equalsIgnoreCase("mayıs");

        boolean yaz = ay.equalsIgnoreCase("haziran") ||
                ay.equalsIgnoreCase("temmuz") ||
                ay.equalsIgnoreCase("agustos");

        boolean sonbahar = ay.equalsIgnoreCase("eylül") ||
                ay.equalsIgnoreCase("ekim") ||
                ay.equalsIgnoreCase("kasım");




        if (kıs){
            System.out.println(" donir misen gardas");
        }else if(ilkbahar){
            System.out.println("tadın cıkar");
        }else if(yaz){
            System.out.println("yanirsen gardas");
        }else if (sonbahar){
            System.out.println("sert rüzgar eser gardas");
        }else {
            System.out.println("akıllı ol ahlın alırım");
            }

         */
        /*
        kullanıcıya sorulan fiyat anketinde  asağıda ki aralıkta gösteren sonucları ekranda gösteren kodu yazınız
        sizce bir bardak kahve kac tl olmalı
        0-5 = ucuz fiyat
        6-11 = normal fiyat
        12-17 = starbucks ta öyle
        18-23  = haya limanın damisin?
        24-29 = yoksa euro mu kaznirsen

        System.out.println("sizce bir bardak fiyat kaç tl olmaı");
        int price = input.nextByte();
        if (price < 0) {
            System.out.println("gecerli fiyat gir zırto");
        } else if (price < 6) {
            System.out.println("hemen su niyetine iç kaçırma");
        } else if (price < 12) {
            System.out.println("normal fiyat");
        } else if (price < 18) {
            System.out.println("starbucks tamısın");
        } else if (price < 18) {
            System.out.println("starbucks tamısın");
        } else if (price < 30) {
            System.out.println("yoks artık euro mu kaznirsen");
        } else {
            System.out.println("cıvırtına çıkar öyle kahve fiyatı olmaz");
        }



        String pwd = "3xy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {


            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }


        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {


            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        } else {

            System.out.println("Ilk karakter harf olmalidir");
             }





        //id 'I' ile baslarsa gecerli id ,aksi halde gecersiz id
        // 'k' ile baslarsa gecerli aksi halde gecersiz id
        System.out.println("id numaranizi girin");

                String id = input.next();
                char ilkHarf = id.charAt(0);
                if (ilkHarf>='A' && ilkHarf<='Z' ){
                    if(ilkHarf=='I'){
                        System.out.println("gecerli");
                    }else{
                        System.out.println("gecersiz");
                    }
                }else if (ilkHarf>='a' && ilkHarf<='z'){
                    if (ilkHarf=='k'){
                        System.out.println("gecerli");
                    }else {
                        System.out.println("gecerli pass girin");
                    }
                }


        //Kullaci ay numarisi girsin kod ay ismi yazsin
        System.out.println("1 den 12 ye kadar bir rakam girniz");
        int ayNo = input.nextInt();
        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;

            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("gecerli sayi giriniz");


                System.out.println("Bir gün ismi giriniz");
                String günIsmi =input.next();
                switch (günIsmi.toLowerCase()){
                    case "pazar":
                        System.out.println("Pazar");
                        break;
                    case "pazartesi":
                        System.out.println("Pazartesi");
                        break;
                    case "salı":
                        System.out.println("Salı");
                        break;
                    case "çarşamba":
                        System.out.println("Çarşamba");
                        break;
                    case "perşembe":
                        System.out.println("Perşembe");
                        break;
                    case "cuma":
                        System.out.println("Cuma");
                        break;
                    case "cumartesi":
                        System.out.println("Cumartesi");
                        break;

                    default:
                        System.out.println("gecerli yazınız");
                }

         */
                    // eğer karakter sayısı 7 den büyükse ilk harf P ile baslamalidir
                    // eğer karakter saiyi 7 den büyükse ilk harf z ie baslamalidir.

        System.out.println("passwordünüzü giriniz");
        System.out.println("password harf ile baslamali rakam ile bitmelidir");
        String pass = input.nextLine();
        char ilkHarf = pass.charAt(0);
        String gecerli = pass.length()<7 ? (pass.charAt(0)=='P' ? "Gecerli"  :  "Gecersiz") :
                (pass.charAt(0)=='z' ? "Gecerli"  :  "Gecersiz");
        System.out.println(gecerli);








        }

    }











