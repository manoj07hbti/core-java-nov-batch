package class_and_object;

public class Two_Wheeler {

    String Brand;
    String Bike;
    int Engine;
    int Mileage;
    double fuelEconomy;
    double Cost;

    // Parametrized Constructor


    public Two_Wheeler(String brand, String bike, int engine, int mileage, double fuelEconomy, double cost) {
        Brand = brand;
        Bike = bike;
        Engine = engine;
        Mileage = mileage;
        this.fuelEconomy = fuelEconomy;
        Cost = cost;
    }

    public static void main(String[] args) {

        // Syntax Classname objName = New Classname (value1,....2,3,4,);

        Two_Wheeler obj = new Two_Wheeler("Suzuki", "Hayabusa", 4, 16, 17.8, 1500000.15);
        System.out.println("Brand : " + obj.Brand + " Bike : " + obj.Bike + " Engine : " + obj.Engine + " Mileage : "+ obj.Mileage + "Fuel Economy : " + obj.fuelEconomy + " Cost : " + obj.Cost);

        Two_Wheeler obj2 = new Two_Wheeler("Honda", "Passion", 1, 30, 5.2, 60000.60);
        System.out.println("Brand : " + obj2.Brand + " Bike : " + obj2.Bike + " Engine : " + obj2.Engine + " Mileage : " + obj2.Mileage + "Fuel Economy : " + obj2.fuelEconomy + " Cost : " + obj2.Cost);

        Two_Wheeler obj3 = new Two_Wheeler("Bajaj", "Pulser", 2, 20, 6.8, 66000.66);
        System.out.println("Brand : " + obj3.Brand + " Bike : " + obj3.Bike + " Engine : " + obj3.Engine + " Mileage : " + obj3.Mileage + "Fuel Economy : " + obj.fuelEconomy + " Cost : " + obj.Cost);

        Two_Wheeler obj4 = new Two_Wheeler("Hero", "Aviator", 1, 40, 4.5, 760000.76);
        System.out.println("Brand : " + obj4.Brand + " Bike : " + obj4.Bike + " Engine : " + obj4.Engine + " Mileage : " + obj4.Mileage + "Fuel Economy : " + obj4.fuelEconomy + " Cost : " + obj4.Cost);

        Two_Wheeler obj5 = new Two_Wheeler("TVS", "Star Sports", 3, 35, 8.8, 55000.55);
        System.out.println("Brand : " + obj5.Brand + " Bike : " + obj5.Bike + " Engine : " + obj5.Engine + " Mileage : " + obj5.Mileage + "Fuel Economy : " + obj5.fuelEconomy + " Cost : " + obj5.Cost);
    }
}
