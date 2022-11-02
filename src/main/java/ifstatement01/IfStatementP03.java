package ifstatement01;

import java.util.Scanner;

public class IfStatementP03 {
    public static void main(String[] args) {
        // Kullanici gün numarasi girsin kod gün ismini yasin..

        Scanner input =new Scanner(System.in);
        System.out.println("Gun numarasi giriniz...");
        byte gunNo = input.nextByte();
        if (gunNo ==1 ){
            System.out.println("Pazar");
        }else if (gunNo==2){
            System.out.println("Pazartesi");
        }else if (gunNo==3){
            System.out.println("Sali");
        }else if (gunNo==4){
            System.out.println("Carsamba");
        }else if (gunNo==5){
            System.out.println("Persembe");
        }else if (gunNo==6) {
            System.out.println("Cuma");
        }else{
            System.out.println("Gecerli bie gun numarasi giriniz...");
        }
    }
}
