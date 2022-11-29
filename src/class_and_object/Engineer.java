package class_and_object;

public class Engineer {

    // Data members or properties or instance variables  of class (Engineer)
    String department;
    String designation;
    double salary;

    //  Created a parameterized constructor
    //  we are using this keyword to distinguish local variable and instance variable.


    public Engineer(String department, String designation, double salary) {
        this.department = department; //  this.instance variable of class = local variables of parameterized constructor
        this.designation = designation;
        this.salary = salary;
    }

    public static void main(String[] args) {

        // To create an object of class(Engineer)---------classname  object_name = new classname();
        // object1
        Engineer obj1 = new Engineer("IT","Software Engineer",78456.980);
        System.out.println(" Department is: "+obj1.department+" Designation is: "+obj1.designation+" Salary is:"+obj1.salary);


        // object2
        Engineer obj2 = new Engineer("Agriculture","Assistant Engineer",87560.450);
        System.out.println(" Department is: "+obj2.department+" Designation is: "+obj2.designation+" Salary is:"+obj2.salary);


        // object3
        Engineer obj3 = new Engineer("Electricity","Junior Engineer",64785.980);
        System.out.println(" Department is: "+obj3.department+" Designation is: "+obj3.designation+" Salary is:"+obj3.salary);


    }




}
