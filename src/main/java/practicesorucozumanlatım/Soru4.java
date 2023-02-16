package practicesorucozumanlatım;

public class Soru4 {




    String isim = "Ali Can";
    int yas = 33;
    int kilo = 85;

    Soru4() {
        System.out.println(isim+"--"+yas+"--"+"--"+kilo);
    }

        Soru4 (String isim, int yas) {// bu hiç kullanılmadı çünkü 2 parametreli variable çağırılmadı

        this.isim = isim;
        this.yas = yas;
    }

    Soru4(String isim) {

    this.isim = isim;
    }

    public static void main(String[] args) {
        Soru4 insan01 = new Soru4();
        System.out.println(insan01.isim);

        Soru4 insan02 = new Soru4("Veli Han");
        System.out.println(insan02.isim + "--" + insan02.yas + "--" + insan02.kilo);
     // insan02.isim="can";

     // System.out.println(insan02.isim + "--" + insan02.yas + "--" + insan02.kilo);

      //  Soru4 insan03 = new Soru4(44,"Ayse Tan"); //yazdırmaz çünkü integer ile baslayan parametre yok

    }
    /*
    main method çalıştığında java okumaya başladı 1)   Soru4 insan01 = new Soru4(); bu obje ve System.out.println(insan01.isim); bunu okur
    okunduğu zaman java hemen default constructur'ı bulur sonra ilk önce içinde ki south'u yazdırır
    biz ekranda ilk önce "Ali Can--33----85" bu çıktıyı görürüz ardından insan01 objesinin 2. isteği olan
     insan01.isim bunu yazdırır biz ekranda "Ali Can" görürüz
     akabinde
    2)   Java   Soru4 insan02 = new Soru4("Veli Han"); ve System.out.println(insan02.isim + "--" + insan02.yas + "--" + insan02.kilo); okur
    hemen parametreli constructoru bulur ancak burada bakar ki this(); var bu nedenle java anlar ki başka bir constructor çağırılıyor
    bu sebeple boş constructura gider ve orda ki south'u yazdırır biz ekranda " Ali Can--33----85" bunu tekrar görürüz
    sonra 2.istek olan  System.out.println(insan02.isim + "--" + insan02.yas + "--" + insan02.kilo); bunu yazdırır ve biz ekranda
    "Veli Han--33--85" görürüz
     */
}
