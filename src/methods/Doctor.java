package methods;

public class Doctor {

  // Properties or Data members or instance variables of class (Doctor) -------name,id,speciality,email address------etc
    String name;
    int id;
    String speciality;


    // Syntax of Method or Function: access_specifier  return_type  method or function_name (input parameters/optional){code}
    // Member function or Method is the capabilities of class
    // Class-----Doctor------capabilities(Method)--------->treatment,operation,fee

    // Method 1:
      public void treatmentMethod(){

        System.out.println(" This is a treatment method...");


      }

     // Method 2:

      public void operationMethod(){

        System.out.println("This ia a operation method....");
      }


      // Method 3:

      public void feeMethod(){

        System.out.println("This is a fee method...");


      }


       // Main method to run program

        public static void main(String[] args) {

        // Step1:  Created an object of class---------- classname object_name = new classname();

           Doctor doctor = new Doctor();

        // Step2: To call method--------------------object_name.method_name

          doctor.treatmentMethod();
          doctor.operationMethod();
          doctor.feeMethod();


      }







}
