package Class_and_object;

public class Buildings {
    //datamember or properties
    String name="Royal building";
    int floor=35;
    int buildingsinsociety=10;
    double price= 33333333.3;

    public static void main(String[] args) {
    // Syntax:class name obj name = new class name ();
            Buildings obj = new Buildings  ();
        //    // object name.properties name
                System.out.println("Numbers are:"+ obj.name);
                System.out.println("Numbers are:"+ obj.floor);
                System.out.println("Numbers are:"+obj.buildingsinsociety);
                System.out.println("Numbers are:"+ obj.price);

            }
    }

