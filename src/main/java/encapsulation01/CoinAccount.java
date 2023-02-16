package encapsulation01;

import java.util.Scanner;

public class CoinAccount {


    private double balance; // bakiye


    public void deposit() // gelen token
    {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen yatırılacak token miktarını giriniz");
        double incomeToken = input.nextDouble();
        this.balance += incomeToken;
        System.out.println("Balance= " + getBalance());
    }

    public void withdraw() // giden token
    {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen çekilecek token miktarını giriniz");
        double outcomeToken = input.nextDouble();
        this.balance -= outcomeToken;


        if (outcomeToken > 50000) {
            throw new RuntimeException("Günlük Limiti aştınız");

        }
        if (outcomeToken > this.balance) {
            throw new RuntimeException("Yetersiz bakiye");

        }
        System.out.println("Balance= " + getBalance());
    }



    public double getBalance() {
        return this.balance;
    }

}