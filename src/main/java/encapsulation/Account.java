package encapsulation;

public class Account {
    // Soru
    // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
    // 2- bir consructor ekleyiniz.
    // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
    // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
    // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
    // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.


    int accountNumber; // müşteri hesap no
    private double balance; // bakiye
    private static int Number = 1; // otomatik verilecek sayac
    public Account() {
        this.accountNumber = Number++;
    }
    public void deposit(double incomeMoney) // gelen para
    {
        this.balance += incomeMoney;
    }
    public void withdraw(double outcomeMoney) // giden para
    {
        if (outcomeMoney > 5000)
            throw new RuntimeException("Günlük Limiti aştınız");
        if (outcomeMoney > this.balance)
            throw new RuntimeException("Yetersiz Bakiye..");
        this.balance -= outcomeMoney;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}
