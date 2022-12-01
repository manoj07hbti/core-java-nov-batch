package Method;

public class Engineer {
    // data member
    String person;
    String occupation;
    int salary;
    //method : capability
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    // name, company, salary

    public void nameMethod() {
        System.out.println("His name is swati");
    }

    public void compnayMethod() {
        System.out.println("She works in MNC");
    }

    public void salaryMethod() {
        System.out.println("Her salary is 50000");

    }

    public static void main(String[] args) {


        // access the method ---- // step 1 - create object SYNTAX - ClassName ObjName = new ClassName();

        Engineer obj = new Engineer();

        // access the method ---- // step 2 - obj name. method name name();

        obj.nameMethod();
        obj.compnayMethod();
        obj.salaryMethod();
    }

}

