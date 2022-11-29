package class_and_object;

public class Employee2 {

    // Data members or properties or instance variables  of class (Employee2)-----------name ,id ,department, salary ,email address------------etc

    String name;
    int id;
    String department;
    double salary;

    //  Created a parameterized constructor
    //  we are using this keyword to distinguish local variable and instance variable.

    public Employee2(String name, int id, String department, double salary) {
        this.name = name; //  this.instance variable of class = local variables of parameterized constructor
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {

        // To create an object of class(Employee2)---------classname  object_name = new classname();

        // object1
        Employee2 obj1 = new Employee2("Rahul",2,"EC",46890.00);
        System.out.println(" Name is: "+obj1.name+" Id is: "+obj1.id+" Department is: "+obj1.department+" Salary is: "+obj1.salary);


        // object2
        Employee2 obj2 = new Employee2("Raj",9,"IT",53694.250);
        System.out.println(" Name is: "+obj2.name+" Id is: "+obj2.id+" Department is: "+obj2.department+" Salary is: "+obj2.salary);

        // object3
        Employee2 obj3 = new Employee2("Aryan",5,"CS",64987.708);
        System.out.println("Name is: "+obj3.name+" Id is: "+obj3.id+" Department is: "+obj3.department+" Salary is: "+obj3.salary);




    }



}
