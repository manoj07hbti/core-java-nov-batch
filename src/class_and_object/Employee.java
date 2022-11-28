package class_and_object;

public class Employee {

    // Properties or Data members--------name, age ,id,department ,salary-----etc

    String name = "XYZ";
    int age = 26;
    int id = 10;
    String department = "D";
    double salary = 45690.60;

    public static void main(String[] args) {

        // To create an object of class(Employee) using default constructor
        // Syntax : classname  object_name = new classname();


        Employee employee = new Employee();

        System.out.println("Name is :"+employee.name);
        System.out.println("Age is :"+employee.age);
        System.out.println("Id is :"+employee.id);
        System.out.println("Department is :"+employee.department);
        System.out.println("Salary is :"+employee.salary);



        System.out.println("Name is :"+employee.name + "Age is :"+ employee.age + "Id is :"+ employee.id + "Department is :"+ employee.department +"Salary is :"+employee.salary);






    }






}
