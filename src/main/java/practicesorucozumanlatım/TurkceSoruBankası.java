package practicesorucozumanlatım;

public class TurkceSoruBankası {

//public static void main(String[] args) {



//}

// public static void sum (int a ,double b){
////     double sum=a+b;
//
// }
//
// public static void sum (double a ,double b){
////     double sum=a+b;
//
// }
//// public static void sum (double b,int a ){
////     double sum=a+b;
//
// }
//// public static void sum (int a,int b ){
////     double sum=a+b;
//
// }
//// public static double sum (int a, int b, int c){
////    double sum=a+b;
////     return sum;
  //  }

    //soru2
  //  public static void multiply(int num1, int num2) {
  //      System.out.println(num1* num2);
  //  }
  //  public static void multiply(int num1) {
  //      System.out.println(num1*num1); }
  //  public static void multiply(double num1, double num2)
  //  { System.out.println(num1* num2); }

  //     //soru3
  //     public static void add(int num1, int num2) { System.out.println(2 + num1 + num2);
  //     }
  // public static void add(double num1, double num2) {
  //     System.out.println(3 + num1 + num2); }

        //soru4
 //     public static void main(String[] args) { updateWord("john", "black");
 //     }
 // public static void updateWord(String s, String t) {
 //     s = s.substring(0,1).toUpperCase() + t.substring(2);
 //     System.out.println(s); }

 //  private static void getData(){ System.out.println("Method 1");
 //  }
 //  public static void getData(){
 //      System.out.println("Method 2"); }
 //  public static void main(String[] args){ getData();
 //  }
        //s oru6

            // public static void add(double n1, double n2) { System.out.println(n1 + n2);
            // }
            // public static void add(int n1, double n2) {
            //     System.out.println(n1 + n2); }
            // public static void add(int n1, int n2) { System.out.println(n1 + n2);
            // }

    //soru 7
         //  public static void function(float i, int j){ System.out.println("Good"):
         //  }
         //   public static void function(double i, double j){
         //   System.out.println("Bad"): }// iki nokta kullanmış exception verir bu şık yan

  // public static void function(float i, int j){ System.out.println("Good"):
  // }
  // public static void function(double i, double j){
  //     System.out.println("Bad"): } // iki nokta kullanmış exception verir bu şık yan
  // public static void main(String[] args){ function(2, 3);
   // }

   // public static void function(float i, int j){ System.out.println("Good"):
   // }
   // public static void function(double i, double j){
   //     System.out.println("Bad"): }// iki nokta kullanmış exception verir bu şık yanlış a/b/c ==> yanlıs
   // public static void main(String[] args){ function(2.1F, 3.2);
   // }

    //soru 8
   //public class MyClass{ int num1;
   //    String name = “Ali”;
   //    public static void main(String args){
   //        add();
   //        product(5); }
   //    public static void add(){ num1++;
   //        int num2 = 6;
   //        char letter; System.out.println(“Do addition”);
   //    }
   //    public void product(int num3){
   //        name = “Veli”;
   //        num2++; System.out.println(num3 * num3);
    //variable'lar static olmadığı için ve intance variable dır ,num2 ve letter local variable'dir doğru,System.out.println(num1) ekrana hiçbirşey yazdırmaz yanlıs exception yazdırır,num2++; kodu Compile Time Error verir.
    //E) product(5); kodu Compile Time Error verir. doğru
   //    } }

    int price = 20000;
    int year = 2020;
    String make = "Honda";
    public static void main(String[] args) {
      TurkceSoruBankası hondaAraba = new TurkceSoruBankası();
      System.out.println(hondaAraba.price); System.out.println(hondaAraba.year - 3);
      System.out.println(hondaAraba.make.replace("H", "K"));
      //c şıkkı doğru
    } }


