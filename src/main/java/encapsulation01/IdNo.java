package encapsulation01;

import java.util.Scanner;

public class IdNo {
   private int password =0;

 public int passOlusturma() {
     Scanner input= new Scanner(System.in);
     System.out.println("Lütfen id no giriniz");
     password=input.nextInt();

         if (password > 999999 || password < 100000) {
             throw new RuntimeException("geçersiz id lütfen 6 haneli sifre girin");

     }
     return password;
 }

}
