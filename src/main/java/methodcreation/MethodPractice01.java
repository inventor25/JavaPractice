package methodcreation;


import java.util.Arrays;

public class MethodPractice01 {


    /*
    public static void isimler( String isimler1 []) {
        String isimler []= new String[4];
        isimler [0]="Ali";
        isimler [1]="Veli";
        isimler [2]="Ayse";
        isimler [3]="Fatma";


        System.out.println(Arrays.toString(isimler));
    }

    public static void main(String[] args) {
String[] isimlerk= new String[4];
        isimler(isimlerk);

    }


    //bir method ile 1 den 100 e kadar çift sayıları liste yazdırın
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt();

        ciftSayi(sayi);

    }
    public static List<Integer> ciftSayi(int sayi) {
        int joker =sayi;
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i<joker; i++) {
            if (sayi%2==0) {

                list.add(i);


            }
            sayi=sayi-1;
        }
        System.out.println(list);

     return list;

    }


    // Example 1:int brr [][] ={{1,2,3},{4,5,6}}; elemanlarını çarpan bir method olusturun

    public static void sayilarCarpim() {
        int carpim = 1;
        int brr[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int[] w : brr) {
            for (int k : w) {
                carpim = carpim * k;

            }

        }
        System.out.println(carpim);

    }

    public static void main(String[] args) {
        sayilarCarpim();
    }


    // Example 1:int brr [][] ={{1,2,3},{4,5,6}}; elemanlarını çarpan inner indexde kileri çarpıp yeni array olusturun
    public static void innerCarpim() {
        int brr[][] = {{1, 2, 3}, {4, 5, 6}};
        int carpim = 1;
        int[] innerc = new int[brr.length];
        for (int i = 0; i < brr.length ; i++) {
            for (int k = 0; k < brr[0].length; k++) {
                carpim = carpim * brr[i][k];


                System.out.println(carpim);

            }
        }

    }

    public static void main(String[] args) {
        innerCarpim();

    }


    // Example 1:int brr [][] ={{1,2,3},{4,5,6}}; elemanlarını çarpan inner indexde kileri çarpıp yeni array olusturun

    public static void main(String[] args) {
        int brr [][] ={{1,2,3},{4,5,6}};
        int arr[][] = new int[brr.length][brr.length-1];
        int k = brr[0][0]*brr[0][1]*brr[0][2];
        int t =brr[1][0]*brr[1][1]*brr[1][2];
        System.out.println(k);
        System.out.println(t);
         arr[0][0]=k;
         arr[1][0]=t;
        System.out.println(Arrays.deepToString(arr));

        }



    public static void main(String[] args) {

        int brr[][] = {{1, 2, 3}, {4, 5, 6}};
        int arr[][] = new int[brr.length][brr.length - 1];
        int carpim = 1;
        int carpim2 = 1;

        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr[i].length; j++) {
                if (i == 0) {
                    carpim *= brr[i][j];

                    arr[i][i] = carpim;
                } else {
                    carpim2 *= brr[i][j];

                    arr[i][i - 1] = carpim2;
                }

            }

        }
        System.out.println(Arrays.deepToString(arr));
    }


// Example 1:int brr [][] ={{1,2,3},{4,5,6}}; elemanların inner indexde kileri çarpıp yeni array olusturun
    public static int[][] innerCarpim(int[][] brr,int[][] arr ) {

        int carpim = 1;
        int carpim2 = 1;

        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr[i].length; j++) {
                if (i == 0) {
                    carpim *= brr[i][j];

                    arr[i][i] = carpim;
                } else {
                    carpim2 *= brr[i][j];

                    arr[i][i - 1] = carpim2;
                }

            }

        }
        System.out.println(Arrays.deepToString(arr));
return arr;
    }

    public static void main(String[] args) {
        int jrr[][] = {{-4, 2, 3}, {8, 5, 6}};
        int krr[][] = new int[jrr.length][jrr.length - 1];
  innerCarpim(jrr,krr);



    }

     */
  //  Example 1:int brr [][] ={{1,2,3},{4,5,6}}; elemanların inner indexde kileri çarpıp yeni array olusturun
    public static void innerCarpim(int[][] brr,int[][] arr ) {

        int carpim = 1;
        int carpim2 = 1;

        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr[i].length; j++) {
                if (i == 0) {
                    carpim *= brr[i][j];

                    arr[i][i] = carpim;
                } else {
                    carpim2 *= brr[i][j];

                    arr[i][i - 1] = carpim2;
                }

            }

        }
        System.out.println(Arrays.deepToString(arr));

    }

    public static void main(String[] args) {
        int jrr[][] = {{-4, 2, 3}, {8, 5, 6}};
        int krr[][] = new int[jrr.length][jrr.length - 1];
        innerCarpim(jrr,krr);



    }
}



