package methods;

public class Engineer {

    // Properties or Data members or instance variables of class (Engineer) -------name,department,designation,salary----etc

    String name;
    String department;
    String designation;
    double salary;


    // Syntax of Method or Function: access_specifier  return_type  method or function_name (input parameters/optional){code}
    // Member function or Method is the capabilities of class
    // Class-----Engineer------capabilities(Method)--------->work ,eat ,sleep

    // Method1:
    public void work(){

    System.out.println(" The Engineer has completed work ...");

    }

    // Method2:
     public void eat(){

       System.out.println("The Engineer has eaten food....");


     }

    // Method3:
     public void sleep(){

      System.out.println("An Engineer is sleeping ......");
     }

    // Main method to run program

    public static void main(String[] args) {



        Engineer engineer = new Engineer();

        // Step2: To call method--------------------object_name.method_name

        engineer.work();
        engineer.eat();
        engineer.sleep();

    }


}
