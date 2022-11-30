package methods;

public class Book {

    //Data member
    String name;
    int pages;
    double price;


     /* todo    Member function or method -- capabilities
          Syntax : access_specifier return_type  method_name (parameter) {CODE..}
           ..
          access_specifier -> public , private , protected, default   THEORY PART
          return_type   -> output of function or method :  void : no return type
          method_name -> can be anything: it should be meaningful
          parameter ->  input parameter : optional*/

    //methods : capabilities
    // read , write

  // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void readMethod(){

       System.out.println("This is Read Method..");
    }

    public void wrtieMethod(){

        System.out.println("This is Write Method..");
    }


    public static void main(String[] args) {

        //SYNTAX :  STEP 1  Create Object ClassName ObjName= new ClassName();
                    Book obj= new Book(); // object created
        // STEP 2  ObjName.methodName();// call method

        obj.readMethod(); // it will call read method

        obj.wrtieMethod(); // it will call write method

    }
}
