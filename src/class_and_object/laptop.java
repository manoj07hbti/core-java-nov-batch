package class_and_object;

public class laptop {

    String brand="hp";
    double price=55000.98;
    int ram=8;
    int memory=500;

    public static void main(String[] args) {

        //SYNTAX--  Classname  objectname = new className();

        laptop obj= new laptop();

        //objname.propertyname;

        System.out.println("printing detail of object = " + obj.brand);
        System.out.println("printing detail of object = " + obj.price);
        System.out.println("printing detail of object = " + obj.ram);
        System.out.println("printing detail of object = " + obj.memory+ "\n");

        // in one line print output

        System.out.println("Brand = " + obj.brand +"--> Price = " +
                obj.price + "--> Ram = " + obj.ram + "--> Memory = " + obj.memory);

    }


}
