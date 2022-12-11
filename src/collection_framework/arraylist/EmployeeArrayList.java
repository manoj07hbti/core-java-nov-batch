package collection_framework.arraylist; // package.subpackage;

import collection_framework.model.Employee; // package.subpackage.class;

import java.util.ArrayList;

public class EmployeeArrayList {

    // Syntax for Method : access_specifier  return_type function or method_name (parameter){code}
    // Parameter---- An input parameter that is optional.
    // Create Employee List


    public ArrayList <Employee> createEmployeeList (){


     // return_type---- ArrayList of Employee --------- ArrayList <Employee>

     // Syntax for Generics : ArrayList <DataType> object_name = new ArrayList <DataType> ();
     // Generics: It tells the DataType------String , Integer ,Double ,and Float or other
     // Generics : It is used to create an object of the ArrayList class


        ArrayList <Employee> employees = new ArrayList<>(); // Here DataType-----Employee


        // First,We will create Employee Data------name ,age ,department ,id ,and salary

        Employee employee1 = new Employee("Ajay",24,"CS",5,45000.60);
        Employee employee2 = new Employee("Abhishek",26,"IT",6,47500.68);
        Employee employee3 = new Employee("Ankit",28,"EC",8,55850.90);
        Employee employee4 = new Employee("Abhay",30,"ME",10,68000.89);

        // For creating the employee list we will add employee's data to an object of ArrayList of Employee  and use the add method.
        // add method : add(value);
        // Syntax for add method : object_name.add_method (); ----------object_name.add(value);


        employees.add(employee1); // 0 index
        employees.add(employee2); // 1 index
        employees.add(employee3); // 2 index
        employees.add(employee4); // 3 index


         return employees; // output



    }

    // Main method to run program
    public static void main(String[] args) {

       // Step1: Created an object of the class (EmployeeArrayList) -------- classname object_name = new classname ();

       EmployeeArrayList obj = new EmployeeArrayList();

       // Step2: To call method ------ object_name.method_name();

     ArrayList <Employee> employeeList =   obj.createEmployeeList(); // Taken a variable ----employeeList------ of ArrayList <Employee>
                                                                     // Stored the output in-------- employeeList----- variable


       // Using the for loop
       // Syntax for for_loop : for (initialization; condition; increment or decrement){code}
       for(int i = 0 ; i<employeeList.size(); i++){

          System.out.println(" Printing the Employee Name : " +"  at Index :"+ i + ": " + employeeList.get(i).getName());
          System.out.println(" Printing the Employee Age : " + " at Index :"+ i +" :" + employeeList.get(i).getAge());
          System.out.println(" Printing the Employee Department : " +" at Index :"+i +" :"+ employeeList.get(i).getDepartment());
          System.out.println(" Printing the Employee Id : " +" at index :"+i+" :" +employeeList.get(i).getId());
          System.out.println(" Printing the Employee Salary : " +" at index :"+i+" :"+employeeList.get(i).getSalary());




       // Print all data in a single line
       System.out.println("Name :"+employeeList.get(i).getName()+" Age :"+employeeList.get(i).getAge()+" Department :"+employeeList.get(i).getDepartment()+" Id :"+employeeList.get(i).getId()+" Salary :"+employeeList.get(i).getSalary());



       }


       // Note: In this class we will not use advanced for loop
        // Syntax for Advanced for_loop : for ( DataType Variable_name : collectionName/arrayName){code}









    }






}
