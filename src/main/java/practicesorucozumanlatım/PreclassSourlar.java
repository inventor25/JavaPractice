package practicesorucozumanlatım;

public class PreclassSourlar {
    //Preclass örnek 1
    int x=5;

    public PreclassSourlar() {

        System.out.println("-x,"+x);

    }


    public PreclassSourlar(int x) {
       this();
        System.out.println("-x."+x);
    }

    public static void main(String[] args) {
        PreclassSourlar mc1 = new PreclassSourlar(4);

        PreclassSourlar mc2 = new PreclassSourlar();



    }

}
