package methods;

import java.util.Scanner;

public class CalculatorAppUsingWhileLoopAndScanner {

    // Syntax for Method : access_specifier return_type function or method_name(parameter){code}
    // Calculator--------4 methods------addition,subtraction,multiplication and division or divide
    /* Used while_loop----to continue calculator work
                   while(condition){
                       code ;
                      increment; or decrement;
                    }
        // increment means : ++ ,decrement means: --
            */

    // Addition
        public int addition(int a,int b){

        int addition_of_two_numbers =a+b;

        return addition_of_two_numbers; // output ----------addition_of_two_numbers;



    }

    // Subtraction

           public int subtraction(int a,int b) {

            int subtraction_of_two_numbers = a - b;

            return subtraction_of_two_numbers; // output ----------subtraction_of_two_numbers;


        }

     // Multiplication

        public int multiplication(int a,int b) {

        int multiplication_of_two_numbers = a*b;

        return multiplication_of_two_numbers; // output ----------multiplication_of_two_numbers;


    }

    // Division
          public int division(int a,int b) {

            int division_of_two_numbers = a / b;

           return division_of_two_numbers; // output ----------division_of_two_numbers;


    }

    // Division using type casting
       public double division1(int a,int b) {

        double division1_of_two_numbers = (double) a / b;

        return division1_of_two_numbers; // output ----------division1_of_two_numbers;


    }




        // Main method to run program
    public static void main(String[] args) {



      // Created  object of Scanner class----------classname  variable_name = new classname(parameter);
      // Input stream as a parameter-----System.in
      // System.in--------reads data from keyboard (user input)
      Scanner scanner = new Scanner(System.in);


      String flag = "Y"; // Taken a flag------String Data type

      // Used while_loop----to continue calculator work
        while (flag.equals("Y")){

            // Write a message --------Welcome to calculator app
            System.out.println(" ********************* WELCOME TO CALCULATOR APP ************************ ");

            // First,we will write message
            System.out.println("Please enter the value of a :");

            int a = scanner.nextInt();        // reads int input data
                                              // object_name.method_name();
                                              // user will give input from keyboard------user input------stored in-----variable a
                                              // in Scanner Class , return type-------int-------method-----nextInt();
                                              // public int nextInt(){code}-------it is already created by java we will only use method

            System.out.println("Please enter the value of b :");

            int b = scanner.nextInt(); // similarly above


            // First, we will write a message for Choice Conditions
            System.out.println("Please enter choice :+ for Addition ,- for Subtraction ,* for Multiplication and / for Division ");
            Scanner scanner1 = new Scanner(System.in); // again create object of scanner class

            String choice = scanner1.nextLine(); // reads String input data
                                                // object_name.method_name();
                                                // user will give input from keyboard------user input------stored in-----variable choice
                                                // in Scanner Class , return type-------String-------method-----nextLine();
                                                // public String nextLine(){code}-------it is already created by java we will only use method




            // Step1: created object of class--------CalculatorAppUsingWhileLoopAndScanner

            CalculatorAppUsingWhileLoopAndScanner obj = new CalculatorAppUsingWhileLoopAndScanner();



            int result = 0; // Taken a variable-----result
                            // Syntax for variable: Data type variable_name = value;

            // if-else statement-----if(condition expression){code}else{code}
            // Step2: to call method----object_name.method_name();
            // stored the output in ------ result

            if(choice.equals("+")) {

                result = obj.addition(a, b);         // output of-------addition method----------stored in------ result
                                                     // reuse variable-------result
                System.out.println(" The addition of two numbers are :" + result);
            }

              else if(choice.equals("-")) {
                result = obj.subtraction(a, b);      // output of-------subtraction method----------stored in------ result
                                                     // reuse variable-------result
                System.out.println(" The subtraction of two numbers are :" + result);

            }

              else if(choice.equals("*")) {
                result = obj.multiplication(a, b);    // output of-------multiplication method----------stored in------ result
                                                      // reuse variable-------result
                System.out.println(" The multiplication of two numbers are :" + result);

            }
              else if(choice.equals("/")) {
                result = obj.division(a, b);           // output of-------division method----------stored in------ result
                                                       // reuse variable-------result
                System.out.println(" The division of two numbers are :" + result);

            }
              else if(choice.equals("/")){
               double result1 = obj.division1(a, b);    // output of-------division1 method----------stored in------double  result1

                System.out.println(" The division of two numbers are :" + result);




            }
              else{

              System.out.println("Invalid choice ,please choose the correct alternative from the given options :");

            }

              // Written a message to continue the calculator app or exit from this app

            System.out.println(" Do you want to continue to use the calculator press : Y for continue OR press any key for exits ");

            flag =  scanner1.nextLine(); // reads String input data------
                                         // user will give input from keyboard------user input-------stored in-----variable flag
                                         // reuse variable----String flag

        }



        // Written a message  thanks for using the calculator app

        System.out.println("************************* THANKS FOR USING CALCULATOR APP ***************************");



    }






}
