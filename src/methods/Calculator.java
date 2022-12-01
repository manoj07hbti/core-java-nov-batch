package methods;

public class Calculator {

    // Syntax for method: access_specifier return_type  method or function_name (input parameter/optional){code}

    // Calculator------4 methods----- addition ,subtraction, multiplication  and division (divide)

    // Addition
    public  void addition(){

       // We will take two numbers----variables,total---3 variables----int a,int b,int result
       int a = 50;
       int b = 20;

       int result = a+b;

        System.out.println("The addition of two numbers are :"+result);

    }

    // Subtraction
    public  void subtraction(){
        // We will take two numbers----variables

        int a = 100;
        int b = 50;
        int result = a-b;
        System.out.println("The Subtraction of two numbers are :"+result);

    }

      // Multiplication
    public void multiplication(){

        // We will take two numbers----variables

        int a = 10;
        int b = 5;
        int result = a*b;
        System.out.println("Multiplication of two numbers are :"+result);

    }

     // Division/divide
    public  void  division(){
        // We will take two numbers----variables

        int a = 150;
        int b = 30;
        int result = a/b;
        System.out.println("Division of two numbers are :"+result);


    }




        // Main method to run program---psvm(String[] args){}
        public static void main(String[] args) {

        // Step1: Created an object of class(Calculator)-------classname object_name = new classname();

         Calculator calculator = new Calculator();

         // Step2: To call method-------object_name.method_name

            calculator.addition();
            calculator.subtraction();
            calculator.multiplication();
            calculator.division();



        }




}
