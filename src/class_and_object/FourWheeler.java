package class_and_object;

public class FourWheeler {

    // Data members or properties or instance variables  of class (FourWheeler )
    String brand;
    int price;
    String engine_displacement; // engine_displacement(engine capacity)---------CC
    String fuel_tank_capacity; // liter


    //  Created a parameterized constructor
    //  we are using this keyword to distinguish local variable and instance variable.

    public FourWheeler(String brand, int price, String engine_displacement, String fuel_tank_capacity) {
        this.brand = brand; //  this.instance variable of class = local variables of parameterized constructor
        this.price = price;
        this.engine_displacement = engine_displacement;
        this.fuel_tank_capacity = fuel_tank_capacity;
    }


    public static void main(String[] args) {
        // To create an object of class(FourWheeler )---------classname  object_name = new classname();

       // Object1
       FourWheeler obj1 = new FourWheeler(" Tata Tiago XZ Plus",776338,"1199cc","35L");
       System.out.println(" Brand is: "+obj1.brand+"  Price is:  "+obj1.price+" Engine Displacement is: "+obj1.engine_displacement+"  Fuel tank capacity is: "+obj1.fuel_tank_capacity);


        // Object2
       FourWheeler obj2 = new FourWheeler("Renault KWID",529336,"999cc","28L");
        System.out.println(" Brand is: "+obj2.brand+"  Price is:  "+obj2.price+" Engine Displacement is: "+obj2.engine_displacement+"  Fuel tank capacity is: "+obj2.fuel_tank_capacity);



        // Object3
        FourWheeler obj3 = new FourWheeler("Hyundai i20",786000,"1493cc","37L");
        System.out.println(" Brand is: "+obj3.brand+"  Price is:  "+obj3.price+" Engine Displacement is: "+obj3.engine_displacement+"  Fuel tank capacity is: "+obj3.fuel_tank_capacity);



    }






}
