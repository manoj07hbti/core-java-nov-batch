package Class_and_object;

public class Mobile {

        // Data member or properties
        String brand= "Apple ";
        String model="14 pro max";
        String gb="gb5";
     String Sim  ="dual";
     String colour ="Golden";
     String network ="5g";
        public static void main(String[] args) {
            // Syntax:class name obj name = new class name ();
           Mobile obj= new Mobile();
            // object name.properties name
            System.out.println("All details are: "+ obj. brand);
            System.out.println("all details are: "+ obj.model);
            System.out.println("All details are: "+obj.gb);
            System.out.println("All details are: "+ obj.Sim);
            System.out.println("All details are: "+obj.colour);
            System.out.println("Network details is :" +obj. network);
        }
    }


