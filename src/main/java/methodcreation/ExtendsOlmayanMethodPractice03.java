package methodcreation;

public class ExtendsOlmayanMethodPractice03 {

    public static void main(String[] args) {
        //child class olmadığı için main method içinde direk
        // MethodPractice03 class'ından direk isimle çağırma yapamıyoruz
        String newProIsim =MethodPractice03.proIsim ="değişenMehmet";
        System.out.println(newProIsim);//değişenMehmet görüldüğü gibi yaptığımız atama ile
        // MethodPractice03 class'ında ki proIsim'i değiştirdik static olduğu için
        System.out.println(MethodPractice03.proIsim);//değişenMehmet görüldüğü gibi yaptığımız atama ile
        // MethodPractice03 class'ında ki proIsim'i değiştirdik static olduğu için

        String newPubIsim = MethodPractice03.pubIsim;
        MethodPractice03.pubIsim="emreberk";//yaptğımız atama bir önce ki atamadan sonra olduğu için henüz tanımlanmadı
        System.out.println(newPubIsim);
        System.out.println(MethodPractice03.pubIsim);
        newPubIsim=MethodPractice03.pubIsim="emreberk";
        System.out.println(newPubIsim);//emreberk görüldüğü gibi yaptığımız atama ile
        // MethodPractice03 class'ında ki pubIsim'i değiştirdik static olduğu için

     MethodPractice03.defaultISim ="ahmetQ";
     String newDefaultISim =MethodPractice03.defaultISim;
        System.out.println(newDefaultISim);
        System.out.println(MethodPractice03.defaultISim);//ahmetQ görüldüğü gibi MethodPractice03 class'ından defaultIsime yapılan
        //yeni atama ile "ahmet" artık bu class'da "ahmetQ" olmustur



    }
}
