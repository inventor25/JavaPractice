package objectsconstructors;

public class StaticObjects {
   static String marka = "Opel";
   static String model = "corsa";
    static int yil = 2020;
   static int motor = 2000;

    public StaticObjects(int yil){


    }

    public StaticObjects(String marka, String model, int yil, int motor) {
        this.marka=marka;
        this.yil=yil;
        this.model=model;
        this.motor=motor;


    }

    public void main (String[] args) {

        StaticObjects car = new StaticObjects("Opel", "astra", 2022, 2500);
        System.out.println(car.marka + " , " + car.model + " , " + car.yil + " , " + car.motor);
        StaticObjects car1 = new StaticObjects(2001);
        System.out.println(car1.yil);
        System.out.println(yil);


    }
}

