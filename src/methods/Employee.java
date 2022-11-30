package methods;

public class Employee {

    // Properties or Data members or instance variables of class (Employee) -------name,age,id,department,salary-----etc
    String name;
    int age;
    int id;
    String department;
    double salary;


    // Syntax of Method or Function: access_specifier  return_type  method or function_name (input parameters/optional){code}
    // Member function or Method is the capabilities of class
    // Class-----Employee------capabilities(Method)--------->work ,salary,eat

    // Method1:
    public void work(){

     System.out.println("The employee has completed the work......");
    }

    // Method2:
    public void salary(){

        System.out.println("The employee has got the salary.....");
    }

    // Method3:

    public void eat(){

        System.out.println("The Employee has eaten the food....");
    }


     // Main method to run program
      public static void main(String[] args) {

        // Step1:  Created an object of class---------- classname object_name = new classname();
           Employee employee =new Employee();


          // Step2: To call method--------------------object_name.method_name

         employee.work();
         employee.salary();
         employee.eat();




      }

    }
