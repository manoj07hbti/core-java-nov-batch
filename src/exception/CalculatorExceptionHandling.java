package exception;

public class CalculatorExceptionHandling {

    // Syntax for Method : access_specifier  return_type  function or method_name (parameter) {code}
    // Parameter------an input parameter that is optional

        public int divide (int a,int b) {

          // return_type---int

          int division_of_two_numbers = a/b;

          return division_of_two_numbers; // output

      }

       /*
       * Exception : Runtime event which stops the execution our code it is known as exception
       * Exception_Handling : We will use try and catch block for handling the exception
       * Rules:
              1- Every try block will have at least one Catch
              2- try block can have multiple catch


       * NOTE :  catch (Exception e)---------- e ------object of Exception
       * If an exception will occur then the catch block will execute
       * If an exception will not occur then the catch block will not execute

       * Syntax for try and catch block :

          try {
                CODE THAT THROWS AN EXCEPTION
           }

          catch (Exception e){

           }

       * Finally_block : It will always execute whether the exception will occur or not
       * Syntax for finally block :  finally {code}
       * The finally_block follows the try-catch block.

       *  try {
                CODE THAT THROWS AN EXCEPTION
           }

          catch (Exception e){

           }
            finally {code}


             */



          public int divide1 (int a,int b){
          // return_type---int

          int division_of_two_numbers = 0; // Here before the division of two numbers, we have taken value as 0

         try {
              division_of_two_numbers = a / b;  // here is thrown exception
         }
          catch (Exception e){

          System.out.println(" Exception occurred  :"+e);

          }
            finally {
          System.out.println(" This is finally block  and it will always execute whether the exception will occur or not ....");

         }


              return division_of_two_numbers; // output
          }

     // Main method to run program
     public static void main(String[] args) {

       // Step1: Created an object of class ----classname  object_name = new classname ();

         CalculatorExceptionHandling obj = new CalculatorExceptionHandling();


      // Step2 : To call method ------object_name.method_name();

          int result = obj.divide(10,2);    // We have taken a variable of integer type-------variable----result
                                                  // Stored the output in a variable result

         System.out.println(" Division of two numbers are :"+result); // Printed the result




         // Arithmetic Exception
         int result1 =  obj.divide1(10,0); // When we have divided 10 by zero then it has given or thrown an exception (Arithmetic Exception)
                                                 // Here is thrown exception ---------  int division_of_two_numbers = a/b;
                                                 // Now we will use try and catch block for handling the exception
                                                 // After this, our program will not stop ,and it will give an output zero

                                                // We have taken a variable of integer type-------variable----result1
                                                // Stored the output in a variable -----result1

         System.out.println(" Division of two numbers after exception handling is :"+result1); // Printed the result1



        // Syntax for Array : DataType variable_name [] = {Value1 ,Value2,Value3,...............,ValueN};
        // Symbol of Array : []
        // Size or length of Array -------- variable_name.length -------- arrayName.length

         String arrayName [] = { "Java" ,"Java8" ,"Spring" ,"SpringBoot"}; // We have taken a String Array

         System.out.println("Printing Array value at the given index 0 "+arrayName[0]); // normal way of printing the array data
         System.out.println("Printing Array value at the given index 1 "+arrayName[1]);
         System.out.println("Printing Array value at the given index 2 "+arrayName[2]);
         System.out.println("Printing Array value at the given index 3 "+arrayName[3]);

         System.out.println("Printing Array size or length  "+arrayName.length);

         // Exception : ArrayIndexOutOfBoundsException
         // Exception : Runtime event which stops the execution our code it is known as exception
         // Exception_Handling : We will use try and catch block for handling the exception



         // Here Exception is occurred because index is 5
         try {

             System.out.println("Printing Array value at the given index  " + arrayName[5]);// Here is thrown exception at index 5 because Array length is 4
                                                                                            // Now we will use try and catch block for handling the exception
         }                                                                                  // After this, our program will not stop ,and it will print the message
          catch (Exception e){

              System.out.println(" Exception occurred  :"+e);

          }
           finally {

             System.out.println(" This is finally block  and it will always execute whether the exception will occur or not ....");
         }


         System.out.println(" Printed Array ....");





          // Here Exception is not occur because index is 1 ( any 0,1,2 3) ,therefore catch block will not execute, and it will print the value of array at the given index 1 (any 0,1,2 3)
         try{

             System.out.println("Printing Array value at the given index  " + arrayName[1]);

         }
         catch (Exception e){

             System.out.println(" Exception occurred  :"+e);

         }
          finally {

             System.out.println(" This is finally block  and it will always execute whether the exception will occur or not ....");

         }





     }





}
