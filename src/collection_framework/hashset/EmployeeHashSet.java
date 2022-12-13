package collection_framework.hashset;

import collection_framework.model.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class EmployeeHashSet {

    /*
       *  HashSet is allowing duplicates data of customized objects or user defined objects (created by the programmer)
       *  Customize means : make according to requirements ----customize a car---- etc
       *  If two objects are having different hashcode then they are different objects ------- h1 (obj1) != h2 (obj2)  then obj1 != obj2
       *  if two object are having same hashcode , it may be equal or not
          then we have to verify with  equals method --> if  equals method gives true then two objects will equal
       *  JVM always assigns different hashcode for every object.

    */

    // Write a program to create an employee HashSet, override hashcode and equals method
    // Syntax for Method : access_specifier return_type  function or method_name (parameter){code}

    public HashSet <Employee> createEmployeeHashSet (){


      // return_type -------- HashSet <Employee> ----------Employee of HashSet

     // Syntax for Generics : Classname < DataType> object_name  = new Classname <DataType>(); --------it is used to create an object of class
     // Syntax for HashSet :  HashSet < DataType> object_name  = new HashSet <DataType>();


        HashSet <Employee> employeeHashSet = new HashSet<>();  // We have created Employee HashSet

        // We will create employee data----it means create object of Employee
        // Every object has a hashcode ,therefore we will create the hashcode of all these given below objects
        // Syntax for hashcode : object_name.hashcode_method(); -------object_name.hashcode();

        Employee employee1 = new Employee("Ankit",24,"CS",5,45000.6890); // created employee data
        System.out.println("Hashcode of employee1 is: "+employee1.hashCode()); // created the hashcode

        Employee employee2 = new Employee("Ajay",25,"IT",2,54000.8500);
        System.out.println("Hashcode of employee2 is: "+employee2.hashCode());

        Employee employee3 = new Employee("Abhishek",28,"EC",10,68945.200);
        System.out.println("Hashcode of employee3 is: "+employee3.hashCode());

       // Repeated or Duplicate data
        Employee employee4 = new Employee("Ajay",25,"IT",2,54000.8500);
        System.out.println("Hashcode of employee4 is: "+employee4.hashCode());

        Employee employee5 = new Employee("Abhishek",28,"EC",10,68945.200);
        System.out.println("Hashcode of employee5 is: "+employee5.hashCode());


        // We will add employee data (employee1..employee5) ------in object (employeeHashSet) of Employee HashSet
        // For adding the employee data we will use add method
        // Syntax for add method : object_name.add(value);

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);


      return employeeHashSet; // Output


    }



    // Main method to run program
    public static void main(String[] args) {

      // Step1 : Created an object of class (EmployeeHashSet)--------classname object_name = new classname();
      EmployeeHashSet obj = new EmployeeHashSet();


      // Step2 : To call method : object_name.method_name();
     HashSet <Employee>  result =  obj.createEmployeeHashSet(); // We have taken a variable------result -----of Employee of HashSet (HashSet <Employee>)
                                                                // We will store the output in variable------ result


        // We will use Advanced for loop to print the employee data
        // We will not use normal for loop to print the employee data because HashSet does not contain index.

        // Syntax for Advanced for_loop : for (DataType variable_name : collectionName /arrayName){code}


        for(Employee var : result){

            System.out.println(" Name:"+var.getName()+"  Age : "+var.getAge()+" Department :"+var.getDepartment()+" Id :"+var.getId()+"  Salary :" +var.getSalary());


        }

    }




}

/* Note :
 * Primitive data types and Non-Primitive data types:
 * Primitive data types are predefined in Java, whereas non-primitive data types are not defined by Java but created by the programmer.
 * The non -primitive data types in java begin with an uppercase letter whereas primitive data type in Java begins with a lowercase letter.
 * The primitive data type’s size depends on the data type whereas all non-primitive data types have the same size.
 * Non-Primitive data types in java are also called reference types because they refer to objects.
 * Example of Non-Primitive data types or reference types : String, Employee,Student ,Person etc. -----in java begin with an uppercase letter---are not predefined by Java
 * The String data type is a non-primitive data type ,but it is predefined in java
 * Example of The primitive data types : int,char ,boolean ,float,long ,short ----in Java begins with a lowercase letter----are predefined in java


 */