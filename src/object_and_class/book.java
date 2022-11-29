package object_and_class;

public class book {
    // data member or properties
    String name="java";
    int page=451;
    double price=193.52;

    public static void main(String[] args) {
        //classname object name= new classname();
        book obj = new book();
        //obj.name
        System.out.println("books total page is :" + obj.page);
        System.out.println("books total page is :" + obj.name);
        System.out.println("books total page is :" + obj.price);
        System.out.println("pages :" + obj.page +"name :" +obj.name+ "prce :" +obj.price);
    }


}
