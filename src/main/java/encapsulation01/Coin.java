package encapsulation01;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {

     IdNo id = new IdNo();
    int pass = id.passOlusturma();
     CoinAccount ca = new CoinAccount();
    ca.deposit();
    ca.withdraw();




}
}