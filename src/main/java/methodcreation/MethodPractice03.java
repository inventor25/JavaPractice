package methodcreation;

public class MethodPractice03 {


    private static String isim ="ali";
    static String defaultISim ="ahmet";
    protected static String proIsim = "mehmet";
    public static String pubIsim = "emre";



    public static void main(String[] args) {
        System.out.println(isim);
        System.out.println(defaultISim);
        System.out.println(proIsim);
        System.out.println(pubIsim);
        System.out.println(pubIsim);

        pubIsim="emremor";//yeni atama yaptık ve artuk bu class'ta static olduğundan proIsim "emremor"
        System.out.println(pubIsim);
        System.out.println(pubIsim);
        System.out.println(proIsim);
        System.out.println(defaultISim);//child class'ta yapılan yeni atamalar static olmasına rağmen parent class'taki atamaları değiştirmedi
        System.out.println(defaultISim);//child olmayan class'ta yapılan yeni atamalar static olmasına rağmen
        // bu class'taki atamaları değiştirmedi
    }






}
