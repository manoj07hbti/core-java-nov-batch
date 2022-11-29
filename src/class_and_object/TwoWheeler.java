package class_and_object;

public class TwoWheeler {


    // Data members or properties or instance variables  of class (TwoWheeler)

      String brand;
      int price;
      String engine_capacity; //engine capacity-----------CC
      String fuel_tank_capacity; // liter

    //  Created a parameterized constructor
    //  we are using this keyword to distinguish local variable and instance variable.


    public TwoWheeler(String brand, int price, String engine_capacity, String fuel_tank_capacity) {
        this.brand = brand; //  this.instance variable of class = local variables of parameterized constructor
        this.price = price;
        this.engine_capacity = engine_capacity;
        this.fuel_tank_capacity = fuel_tank_capacity;
    }

    public static void main(String[] args) {

        // To create an object of class(TwoWheeler)---------classname  object_name = new classname();

        // Object1
        TwoWheeler obj1 = new TwoWheeler("Hero Splendor Plus",70954,"97.2cc","9.8L");
        System.out.println("Brand is: "+obj1.brand+" Price is: "+obj1.price+" Engine capacity is: "+obj1.engine_capacity+" Fuel tank capacity is: "+obj1.fuel_tank_capacity);


        // Object2
        TwoWheeler obj2 = new TwoWheeler("Honda Shine",83914,"124cc","10.5L");
        System.out.println("Brand is: "+obj2.brand+" Price is: "+obj2.price+" Engine capacity is: "+obj2.engine_capacity+" Fuel tank capacity is: "+obj2.fuel_tank_capacity);

        // Object3
       TwoWheeler obj3 = new TwoWheeler("Hero Passion Pro",77408,"113.2cc","10L");
       System.out.println("Brand is: "+obj3.brand+" Price is: "+obj3.price+" Engine capacity is: "+obj3.engine_capacity+" Fuel tank capacity is: "+obj3.fuel_tank_capacity);




    }




}
