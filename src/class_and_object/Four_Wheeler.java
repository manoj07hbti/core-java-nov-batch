package class_and_object;

public class Four_Wheeler {

    String Name;
    String FuelType;
    int SeatingCapacity;
    int Engine;
    double Cost;
    double Mileage;

    // Parametrized constructor


    public Four_Wheeler(String name, String fuelType, int seatingCapacity, int engine, double cost, double mileage) {
        Name = name;
        FuelType = fuelType;
        SeatingCapacity = seatingCapacity;
        Engine = engine;
        Cost = cost;
        Mileage = mileage;
    }

    public static void main(String[] args) {
        // Classname objName = new Classname(value1,...2,....3,....4);
        Four_Wheeler obj = new Four_Wheeler("Black Scorpio", "Diesel & Petrol", 7,2184,250000.25, 16.05);
        System.out.println("Name : " + obj.Name + " Fuel Type : " + obj.FuelType + " Seating Capacity : " + obj.SeatingCapacity + " Engine : " + obj.Engine + " Cost : " +obj.Cost + " Mileage : " + obj.Mileage);


        Four_Wheeler obj2= new Four_Wheeler("Black Thar", "Diesel & Petrol", 6,1899,1200000.12, 12.12);
        System.out.println("Name : " + obj2.Name + " Fuel Type : " + obj2.FuelType + " Seating Capacity : " + obj2.SeatingCapacity + " Engine : " + obj2.Engine + " Cost : " +obj2.Cost + " Mileage : " + obj2.Mileage);


        Four_Wheeler obj3 = new Four_Wheeler("Black Fortuner", "Diesel & Petrol", 8,2230,5000000.50, 10.10);
        System.out.println("Name : " + obj3.Name + " Fuel Type : " + obj3.FuelType + " Seating Capacity : " + obj3.SeatingCapacity + " Engine : " + obj3.Engine + " Cost : " +obj3.Cost + " Mileage : " + obj3.Mileage);


        Four_Wheeler obj4 = new Four_Wheeler("Black Safari", "Diesel & Petrol", 9,2023,550000.55, 11.11);
        System.out.println("Name : " + obj4.Name + " Fuel Type : " + obj4.FuelType + " Seating Capacity : " + obj4.SeatingCapacity + " Engine : " + obj4.Engine + " Cost : " +obj4.Cost + " Mileage : " + obj4.Mileage);


        Four_Wheeler obj5 = new Four_Wheeler("Black Bolero", "Diesel & Petrol", 10,1952,180000.18, 18.18);
        System.out.println("Name : " + obj5.Name + " Fuel Type : " + obj5.FuelType + " Seating Capacity : " + obj5.SeatingCapacity + " Engine : " + obj5.Engine + " Cost : " +obj5.Cost + " Mileage : " + obj5.Mileage);









    }
}
