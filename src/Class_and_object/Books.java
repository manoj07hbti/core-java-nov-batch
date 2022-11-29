package Class_and_object;

public class Books {

// Datamember or properties
        String name = "Book";
        int pages = 1200;
        double price = 600.0;
        String type = "Historical book";
        String Title = "Autobiography";

    public static void main(String[] args) {
        // Syntax:class name obj name=new classname ();
        Books obj = new Books();
// obj name .properties name
        System.out.println("Details of is " + obj.name);
        System.out.println("Details of is " + obj.pages);
        System.out.println("Details of is " + obj.price);
        System.out.println("Details of is " + obj.type );
        System.out.println("Details of is " + obj.Title);

    }

    }

