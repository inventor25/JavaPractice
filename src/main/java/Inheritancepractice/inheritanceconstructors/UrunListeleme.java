package Inheritancepractice.inheritanceconstructors;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UrunListeleme extends UrunIsimler{

  static  UrunIsimler urunIsimler = new UrunIsimler();
  static  UrunIsimler urunIsimler2 = new UrunIsimler("yağ","un","yumurta","sut");

    public UrunListeleme(String yag, String un, String yumurta, String sut) {
        super(yag, un, yumurta, sut);

    }

    public static void list () {

        urunIsimler.un="tekbaş";
        urunIsimler.yag="bizim";
        urunIsimler.yumurta="köy";
        urunIsimler.setSut("yağlı");

       ArrayList<String> list = new ArrayList<>();
       list.add(urunIsimler.un);
       list.add(urunIsimler.yag);
       list.add(urunIsimler.yumurta);
       list.add(urunIsimler.getSut());
       System.out.println(list);
   }


    public static void main(String[] args) {
        list();
        System.out.println(urunIsimler2.getSut());
    }
}

