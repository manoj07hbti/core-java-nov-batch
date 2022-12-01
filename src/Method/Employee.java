package Method;

public class Employee {

    // data member

    String name;
    String company;
    int salary;
    //method : capability
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    // name, company, salary

    public void nameMethod() {
        System.out.println("it is a method class");
    }

    public void workMethod() {
        System.out.println("She works in MNC");
    }

    public void officeMethod() {
        System.out.println(" 50000 member in his office");

    }

    public static void main(String[] args) {


        // access the method ---- // step 1 - create object SYNTAX - ClassName ObjName = new ClassName();

        Employee obj = new Employee();

        // access the method ---- // step 2 - obj name. method name name();

        obj.nameMethod();
        obj.workMethod();
        obj.officeMethod();
    }

}


















