package aliabimlepractice;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık değerini giriniz \n lütfen hava da ki nem değerini giriniz");
        int sicaklik = input.nextInt();
        int nemDegeri = input.nextInt();
        boolean donma = sicaklik < 0 && sicaklik > -20;
        boolean isiDalgasi = sicaklik > 20;
        boolean yagmur = nemDegeri > 80;
        boolean doluFirtinasi = sicaklik < -20;

        if (nemDegeri > 80) {
            if (doluFirtinasi) {
                System.out.println(sicaklik + " " + "Dolu fırtınası ve yağmur var dikkatli ol");

            } else if (donma) {
                System.out.println(sicaklik + " " + "Dışarısı donuyor ve yağmur var");


            } else if (isiDalgasi) {
                System.out.println(sicaklik + " " + "Hava nemli ve sıcak");

            }else System.out.println("hava normal");
        }
        if (nemDegeri < 80) {
            if (doluFirtinasi) {
                System.out.println(sicaklik + " " + "Dolu fırtınası var dikkatli ol");
            } else if (donma) {
                System.out.println(sicaklik + " " + "Dışarısı donuyor var");

            } else if (isiDalgasi) {
                System.out.println(sicaklik + " " + "Hava sıcak yanıyor");
            }else System.out.println("hava normal");
        }
    }}




        /*

        if (donma&&yagmur) {
            System.out.println(sicaklik + " dışarda yağmur var");

        }else if (donma) {
                System.out.println(sicaklik +" "+ "Dışarısı donuyor");

        } else if (doluFirtinasi) {
            System.out.println(sicaklik+" "+ "Dolu fırtınası var dikkatli ol");

        } else if (isiDalgasi && yagmur) {
            System.out.println(sicaklik+ " "+ "Hava nemli ve sıcak");


        } else if (isiDalgasi) {
            System.out.println(sicaklik+" "+ "Sicak hava dalgasi var yanirsen dikkat et");


        }else
        System.out.println("gecerli girin");

         */









