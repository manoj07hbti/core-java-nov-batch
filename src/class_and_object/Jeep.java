package class_and_object;

public class Jeep {

    // Data member or properties

    static String name = " Black Scorpio" ;
    int launched = 2002 ;
    double price = 2500000.23 ;


    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();

        Jeep obj = new Jeep(); // obj object is created

        // objName.propertyName

        System.out.println("The name of this jeep is : " + obj.name);
        System.out.println("This jeep was launched in : " + obj.launched);
        System.out.println("This jeep is worth : " + obj.price);
        System.out.println("Name : " + obj.name + " launched : " + obj.launched + " Price : " + obj.price);





        //  SYNTAX ClassName objName = new ClassName();

        Jeep obj2 = new Jeep();

        // objName.propertyName

        System.out.println("The name of this jeep is : " + obj2.name);
        System.out.println("This jeep was launched in : " + obj2.launched);
        System.out.println("This jeep is worth : " + obj2.price);
        System.out.println("Name : " + obj2.name + " launched : " + obj2.launched + " price : " + obj2.price );



    }






}
