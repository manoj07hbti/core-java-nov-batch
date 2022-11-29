package class_and_object;

public class twowheelerC {

    String bikename;
    int engine;
    double BHP;
    String fuel;
    String tyretype;
    float price;

    public twowheelerC(String bikename, int engine, double BHP, String fuel, String tyretype, float price) {
        this.bikename = bikename;
        this.engine = engine;
        this.BHP = BHP;
        this.fuel = fuel;
        this.tyretype = tyretype;
        this.price = price;
    }

    public static void main(String[] args) {
        //classname obj =new classname( p1,2,3,4,5,...n);
        twowheelerC obj = new twowheelerC("Ducati Panigale V4",1103,126.68,"petrol",
                "tubeless",26.46F );
        System.out.println("Details of two wheeler's---->" +"\n"+"Bike Name = " + obj.bikename);
        System.out.println("Engine (cc) = " + obj.engine);
        System.out.println("BHP = " + obj.BHP);
        System.out.println("Fuel Type = " + obj.fuel);
        System.out.println("Tyre type = " + obj.tyretype);
        System.out.println("Price (lac.) = " + obj.price);

        twowheelerC obj2 =new twowheelerC("Harley Davidson Sportstar 500 ",
                1003,110.45,"Petrol","tubeless",
                5.8F);

        System.out.println("\n"+"Details of two wheeler----2 >" +"\n"+"Car Name = " + obj2.bikename);
        System.out.println("Engine (cc) = " + obj2.engine);
        System.out.println("BHP = " + obj2.BHP);
        System.out.println("Fuel Type = " + obj2.fuel);
        System.out.println("Transmission = " + obj2.tyretype);
        System.out.println("Price (lac.) = " + obj2.price);
    }
}
