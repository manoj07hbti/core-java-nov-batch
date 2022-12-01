package methods;

public class Factorial {

    // Syntax for method: access_specifier return_type  method or function_name (input parameter/optional){code}
    // 5! = 5x4x3x2x1 =120
    // 4! = 4x3x2x1 = 24
    // Logic for factorial---- factorial = number*factorial;



   // 5!
    public void factorialOfFive(){

      // We will take  variables-----number,factorial

      int factorial = 1;


     // Syntax of For_loop : for(initialization ,condition, increment/ decrement){code}

        for(int number = 5; number>=1; number--){

            factorial = number*factorial;

        }
          System.out.println("Factorial of number 5 is :"+factorial); // result---120



    }

     // 4!


    public void factorialOfFour(){

        // We will take  variables-----number,factorial

        int factorial = 1;


        // Syntax of For_loop : for(initialization ,condition, increment/ decrement){code}

        for(int number = 4; number>=1; number--){

            factorial = number*factorial;

        }
        System.out.println("Factorial of number 4 is :"+factorial);  // result---24



    }


         // Main method to run program---psvm(String[] args){}
          public static void main(String[] args) {

        // Step1: Created an object of class(Calculator)-------classname object_name = new classname();
        Factorial factorial = new Factorial();

        // Step2: To call method-------object_name.method_name

         factorial.factorialOfFive();
         factorial.factorialOfFour();


          }




}
