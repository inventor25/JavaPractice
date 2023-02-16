package objectsconstructors;

public class StaticObjects02 {


    public static void main(String[] args) {
        StaticObjects newCar=new StaticObjects(2021);
        int yil =2010;
        StaticObjects.yil=yil;
        System.out.println(newCar.yil);

    }
}
