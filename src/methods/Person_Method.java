package methods;

public class Person_Method {
    String name;
    String city;
    int pincode;

    // SYNTAX:
    /* todo    Member function or method -- capabilities
           Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
             public: accessible for all
        private:accessible only within class
        protected: accessible between Parent and child
        default:  accessible within package
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void walkMethod (){
        System.out.println("This is Walk Method");
    }

    public void eatMethod (){
        System.out.println("This is Eat Method");
    }

    public void sleepMethod (){
        System.out.println("This is Sleep Method");
    }



    public static void main(String[] args) {
        // access the method ---- // step 1 - create object SYNTAX - ClassName ObjName = new ClassName();

        Person_Method obj = new Person_Method();
        obj.walkMethod();
        obj.eatMethod();
        obj.sleepMethod();
    }
}
