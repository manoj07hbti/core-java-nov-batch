package Method;

public class Person {
    // data member

    String name;
    String study;
    int salary;
    String work;

    //method : capability
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}


    public void nameMethod() {
        System.out.println("it is a method class");
    }

    public void workMethod() {
        System.out.println("he works in a company");
    }

    public void studyMethod() {
        System.out.println(" he is  graduate");

    }
    public void salaryMethod() {
        System.out.println(" he earn a good salary");

    }
    public static void main(String[] args) {


        // access the method ---- // step 1 - create object SYNTAX - ClassName ObjName = new ClassName();

        Person obj = new Person();

        // access the method ---- // step 2 - obj name. method name name();

        obj.nameMethod();
        obj.workMethod();
        obj.studyMethod();
        obj.salaryMethod();
    }

}



