package practicesorucozumanlatım;

public class PreclassSorular2 {
    int x =3;
    int y = 5;

    public PreclassSorular2() {
        x+=1;
        System.out.println("-x"+x);
    }
   public PreclassSorular2(int i) {
        this();
        this.y=i;
        x +=y;
       System.out.println("-x"+x);//9

   }

    public PreclassSorular2(int i, int i2) {
        this(8);
        this.x -=4;
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        PreclassSorular2 mc1 = new PreclassSorular2(4,3);

    }

}
