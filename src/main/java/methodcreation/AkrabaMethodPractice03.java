package methodcreation;

public class AkrabaMethodPractice03 extends MethodPractice03{






    public static void main(String[] args) {

        //private static String isim ="ali"; (private olduğu için parent class'dan çağıramadık


        String newDefaultISim= MethodPractice03.defaultISim;
        System.out.println(newDefaultISim);

        String newProIsim = MethodPractice03.proIsim;
        System.out.println(newProIsim);

        String newPubIsim = MethodPractice03.pubIsim;
        System.out.println(newPubIsim);

        MethodPractice03.pubIsim ="değişenEmre";
        System.out.println(pubIsim);

        pubIsim= "emrecan";
        System.out.println(pubIsim);
        System.out.println(pubIsim);
        System.out.println( MethodPractice03.pubIsim);//parent class'tan tekrar pubIsim çağırmamıza rağmen
        // static oldğundan yaptığımız atamayla pubIsim "emracan" olmustur bu class'ta
         proIsim ="mehmetakif";
        System.out.println(proIsim);//parent class'tan tekrar proIsim çağırmamıza rağmen
        // static oldğundan yaptığımız atamayla proIsim "mehmetakif" olmustur bu class'ta

        defaultISim = "Qahmet";
        System.out.println(defaultISim);





    }


}
