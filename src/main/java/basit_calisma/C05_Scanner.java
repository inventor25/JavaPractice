package basit_calisma;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyadınızı giriniz: ");
        String soyad=scan.nextLine();

        System.out.println("Lütfen memleketinizi giriniz: ");
        String memleket=scan.nextLine();

        System.out.println("Lütfen konumunuzu giriniz: ");

            String konum=scan.nextLine();
                System.out.println("Lütfen yaşınızı giriniz: ");
                Byte yas =scan.nextByte();
        System.out.println("Lütfen boyunuzu giriniz: ");
        Byte boy = scan.nextByte();

        System.out.println("Lütfen Javayı sevip sevmediğinizi giriniz: ");
        boolean seviyormu =scan.hasNext();








    }
}
