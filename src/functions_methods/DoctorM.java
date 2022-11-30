package functions_methods;

public class DoctorM {

    // Data member

    String name;
    int age;
    double salary;

    /* todo    Member function or method -- capabilities
          Syntax : access_specifier return_type  method_name (parameter) {CODE..}
           ..
          access_specifier -> public , private , protected, default   THEORY PART
          return_type   -> output of function or method :  void : no return type
          method_name -> can be anything: it should be meaningful
          parameter ->  input parameter : optional*/

    // method : capabilities
    //Treatment,operation,fees

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void treatmentMethod(){

        System.out.println("this is a treatment method");
    }
    public void operationMethod(){
        System.out.println("this is a operation method");
    }
    public void feesMethod(){
        System.out.println("this iS a fees Method");
    }

    public static void main(String[] args) {

        //SYNTAX :  STEP 1  Create Object ClassName ObjName= new ClassName();
        DoctorM obj = new DoctorM();
        //STEP 2  ObjName.methodName();// call method
        obj.treatmentMethod();
        obj.operationMethod();
        obj.feesMethod();

    }
}
