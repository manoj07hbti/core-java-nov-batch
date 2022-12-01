package methods;

public class Armstrong {

    // Syntax for method: access_specifier return_type  method or function_name (input parameter/optional){code}
    // number = 153-----1*1*1+5*5*5+3*3*3 = 1+125+27 = 153----Armstrong number
     // number = 165--- 1*1*1+6*6*6+5*5*5 = 1+216+125=342-----not Armstrong number


     public  void checkArmstrongNumber(){

          // We will take variable---number ,temp,remainder,sum

          int number = 153; // similarly,we can take any number ------int number = 165;
          int temp = number; // stored the original number(153) in temp
          int remainder ,sum =0;

      // Using while_loop
      // while(number!=0) or while(number>0) both are true

          while(number!=0){

             remainder = number%10; // % --------modulus operator
             number = number/10;

             sum = sum + remainder*remainder*remainder;


          }

          // Using if-else statement: if( condition expression){code} else{code}
          // == -------equal equal operator or double equal operator

         if(temp == sum){

            System.out.println("It is an Armstrong number...."+sum); // sum----153


         }
          else {

              System.out.println("It is not Armstrong number...."+sum);

         }



     }

       // Main method to run program---psvm(String[] args){}

     public static void main(String[] args) {

          // Step1: Created an object of class(Calculator)-------classname object_name = new classname();

      Armstrong armstrong = new Armstrong();

          // Step2: To call method-------object_name.method_name
          armstrong.checkArmstrongNumber();

     }





}
