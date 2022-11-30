package methods;

public class Doctor_Method {
    String dep;
    String post;
    double salary;

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
    public void treatmentMethod (){
        System.out.println("This is Treatment Method");
    }

    public void operationMethod (){
        System.out.println("This is Operation Method");
    }

    public void feeMethod (){
        System.out.println("This is Fees Method");
    }



    public static void main(String[] args) {
        // access the method ---- // step 1 - create object SYNTAX - ClassName ObjName = new ClassName();

        Doctor_Method obj = new Doctor_Method();
        obj.treatmentMethod();
        obj.operationMethod();
        obj.feeMethod();
    }
}
