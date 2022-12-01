package method;

public class Book {



    public void readmethod(){
        System.out.println("this is readmethod");
    }
    public void writemethod(){
        System.out.println("this is write method");
    }

    public static void main(String[] args) {
        Book obj=new Book();
        obj.readmethod();
        obj.writemethod();
    }
}
