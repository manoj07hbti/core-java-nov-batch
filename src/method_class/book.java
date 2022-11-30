package method_class;

public class book {
    // data member
    String name;
    int page;
    double price;
  //  method syntax
// syntax: access_specifier return_type method_name (parameter){code}
    public void readmethod(){
        System.out.println("this is my read method");
    }
    public void writemethod(){
        System.out.println("this is my write method ");
    }

    public static void main(String[] args) {
        book obj=new book();
        obj.readmethod();
        obj.writemethod();
    }


}
