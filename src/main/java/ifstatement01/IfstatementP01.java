package ifstatement01;

import java.util.Scanner;

public class IfstatementP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int s = input.nextInt();
        if(s%2 ==0) {
            System.out.println("Cİft sayi...");
        }
        if(s%2!=0){
            System.out.println("Tek sayi...");

          }

        //2.yol
        if(s%2 ==0) {
            System.out.println("Cİft sayi...");
        }else{
            System.out.println("Tek sayi...");

        }

    }

}