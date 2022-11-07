package exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {


    public static void main(String[] args) throws IOException, IllegalGradeException {
        readTheTextFromTheNames();
        readTheNames();
        boolean check = checkNameFormat("Ahmet");
        System.out.println(check);
       // boolean check1 = checkNameFormat("a");
        retirementAge(66);
       // retirementAge(-12);




    }

    public static void readTheTextFromTheNames() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/exceptions/Ornek01.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);

        }
    }


    public static void readTheNames() {


        try {
            FileInputStream fis = new FileInputStream("src/main/java/exceptions/Ornek01.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir character var");
        }

    }

    public static boolean checkNameFormat(String name) {
        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            return true;
        } else {
         throw  new IllegalNameException("neydirsen hata var");
        }
    }


    public static void retirementAge(int a) throws IllegalGradeException {
        if (a > 65) {
            System.out.println(a + " haria emeklisin");
        } else {
            throw new IllegalGradeException("Emekli yaşı gecersiz");
        }

    }


    }