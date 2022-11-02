package ifstatement01;

import java.util.Scanner;

public class IfStatementP04 {
    public static void main(String[] args) {
        //Kullanicidan gün isimlerini aliniz O gunun hafta sonu mu hafta icimi oldugunu söyleyiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gun = input.next();
        if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta ici...");
        }else if(gun.equalsIgnoreCase("Sali")){
            System.out.println("Hafta ici...");
        }else if(gun.equalsIgnoreCase("Carsamba")){
            System.out.println("Hafta ici...");
        }else if(gun.equalsIgnoreCase("Persembe")){
            System.out.println("Hafta ici...");
        }else if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
        //2.YOL

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if ( gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Sali")||
                gun.equalsIgnoreCase("Carsamba")||
                gun.equalsIgnoreCase("Persembe")||
                gun.equalsIgnoreCase("Cuma")) {
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
    }
}
