package ifstatement01;

import java.util.Scanner;

public class IfStatementP02 {
    public static void main(String[] args) {
        // Bir sayinin negatif, poztif veya notr olduğunu söyleyen bir kod yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        double t = input.nextDouble();
        if (t < 0) {
            System.out.println("Negatif sayi...");


        } else if (t == 0) {
            System.out.println("Notr sayi...");
        } else {
            if (t > 0) {
                System.out.println("Pozitif sayi...");
            }
        }

    }}

