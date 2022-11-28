package class_and_object;

public class Book {

    //data member or properties

   String name="JAVA";
   int pages=500;
   double price=500.45;


    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();
        Book obj = new Book(); // obj object is created

        // objName.prpertyname;

        System.out.println("Printing object details : " + obj.name);

        System.out.println("Printing object details : " + obj.pages);

        System.out.println("Printing object details : " + obj.price);

        System.out.println("Name: " + obj.name + " pages : " + obj.pages + " Price: " + obj.price);

        //SYNTAX: ClassName objName= new ClassName();

        Book obj2= new Book();

        System.out.println("Printing object 2 details : " + obj2.name);

        System.out.println("Printing object 2 details : " + obj2.pages);

        System.out.println("Printing object 2 details : " + obj2.price);

    }

}
