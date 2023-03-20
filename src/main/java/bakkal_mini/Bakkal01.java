package bakkal_mini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bakkal01 {

    public static double getOrtalamaKazanc(List<Double> liste){

        double ortalama=0;
        for (double w:liste)
        {
            ortalama+=w;
        }

        return ortalama/liste.size();
    }

    public static void getOrtalamaninUstundeKazancGunleri(List<String> gunListe, List<Double> gunlukKazancListesi,double ortalama){

        List<String> sonGunListe=new ArrayList<>();
        for (int i = 0; i < gunlukKazancListesi.size(); i++)
        {
            if (ortalama< gunlukKazancListesi.get(i))
            {
                sonGunListe.add(gunListe.get(i));
            }
        }
        System.out.println("Ortalamanın üstündeki günler\n"+sonGunListe);
    }
    public static void getOrtalamaninAltindaKazancGunleri(List<String> gunListe, List<Double> gunlukKazancListesi,double ortalama){

        List<String> sonGunListe=new ArrayList<>();
        for (int i = 0; i < gunlukKazancListesi.size(); i++)
        {
            if (ortalama> gunlukKazancListesi.get(i))
            {
                sonGunListe.add(gunListe.get(i));
            }
        }
        System.out.println("Ortalamanın altındaki günler\n"+sonGunListe);
    }

    public static boolean isFind(int[]dizi, int sayi){
        for (int w:dizi)
        {
            if (w == sayi)
            {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args)
    {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */

   /* String[] arrGunler={"1. Gün Pazartesi","2. Gün Salı","3. Gün Carsamba","" +
            "4. Gün Persembe","5. Gün Cuma","6. Gün Cumartesi","7. Gün Pazar"};

    List<String> listeGunler=new ArrayList<>();

    for (String w:arrGunler)
    {
        listeGunler.add(w);
    }
    List<Double> gunlukKazancListesi=new ArrayList<>();

    Scanner input=new Scanner(System.in);

    System.out.println("Bir Haftalık guluk kazanclarınızı giriniz ");
    int gun=1;
    double kazanc=0;
    int counter=0;

    while (gun!=8){
        System.out.print(arrGunler[counter++]+" kazacınız = ");
        kazanc= input.nextDouble();
        gunlukKazancListesi.add(kazanc);
        gun++;
    }
    System.out.println(gunlukKazancListesi);

    double ortlama=getOrtalamaKazanc(gunlukKazancListesi);

    System.out.println("ortalama kazanc = "+ortlama);

    getOrtalamaninUstundeKazancGunleri(listeGunler,gunlukKazancListesi,ortlama);
    getOrtalamaninAltindaKazancGunleri(listeGunler,gunlukKazancListesi,ortlama);*/

        //dizimizdeki tekrarsızları yazdıran kodu yazın.
        int[] dizi={1,3,5,6,3,1,7,9};
        List<Integer> liste=new ArrayList<>();
        int[] konteynir=new int[dizi.length];
        int count=0;

        for (int i = 0; i < dizi.length ; i++)
        {
            for (int j = 0; j < dizi.length ; j++)
            {
                if (isFind(konteynir,dizi[i]))
                {
                    konteynir[count++]=dizi[i];
                }
            }
        }
        System.out.println(Arrays.toString(konteynir));
    }
}