package methods;

public class Employee {

// DATA MEMBER

    String work;
    String eat;
    int salary;

    // methods

    public void setWorkMethod() {

        System.out.println("This is Work Method");
    }

    public void setEatMethod() {

        System.out.println("This is Eat Method");
    }

    public void setSalaryMethod() {

        System.out.println("This is Salary Method");
    }


    // SYNTAX

    public static void main(String[] args) {

        Employee obj = new Employee();

        obj.setWorkMethod();
        obj.setEatMethod();
        obj.setSalaryMethod();

    }
}
