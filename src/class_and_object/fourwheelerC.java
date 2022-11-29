package class_and_object;

import java.sql.SQLOutput;

public class fourwheelerC {

    String carname;
    int engine;
    double BHP;
    String fuel;
    String transmission;
    float price;

    public fourwheelerC(String carname, int engine, double BHP, String fuel, String transmission, float price) {
        this.carname = carname;
        this.engine = engine;
        this.BHP = BHP;
        this.fuel = fuel;
        this.transmission = transmission;
        this.price = price;
    }

    public static void main(String[] args) {
        //classname obj =new classname( p1,2,3,4,5,...n);
        fourwheelerC obj = new fourwheelerC("Morris Garages (MG Hector)",1956,167.68,"petrol",
                "Automatic/Manual",20.46F );
        System.out.println("Details of Four wheeler's---->" +"\n"+"Car Name = " + obj.carname);
        System.out.println("Engine (cc) = " + obj.engine);
        System.out.println("BHP = " + obj.BHP);
        System.out.println("Fuel Type = " + obj.fuel);
        System.out.println("Transmission = " + obj.transmission);
        System.out.println("Price (lac.) = " + obj.price);

        fourwheelerC obj2 =new fourwheelerC("BMW 3 ",1998,255,"Petrol/Deisel","Manual",
                46.86F);

        System.out.println("\n"+"Details of Four wheeler----2 >" +"\n"+"Car Name = " + obj2.carname);
        System.out.println("Engine (cc) = " + obj2.engine);
        System.out.println("BHP = " + obj2.BHP);
        System.out.println("Fuel Type = " + obj2.fuel);
        System.out.println("Transmission = " + obj2.transmission);
        System.out.println("Price (lac.) = " + obj2.price);



    }
}
