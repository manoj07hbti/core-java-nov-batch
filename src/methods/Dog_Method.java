package methods;

public class Dog_Method {
    String breed;
    String name;


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
    public void barkMethod (){
        System.out.println("This is Bark Method");
    }

    public void runMethod (){
        System.out.println("This is Run Method");
    }

    public void playMethod (){
        System.out.println("This is Play Method");
    }



    public static void main(String[] args) {
        // access the method ---- // step 1 - create object SYNTAX - ClassName ObjName = new ClassName();

        Dog_Method obj = new Dog_Method();
        obj.barkMethod();
        obj.runMethod();
        obj.playMethod();
    }
}
