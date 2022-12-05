package methods;

import java.util.Scanner;

public class CalculatorAppUsingScannerWithChoice {

    // Syntax for Method: access_specifier return_type function or method_name(input parameter ){code}
    // Calculator App-----4 methods------addition ,subtraction,multiplication ,division or divide

    // Addition
    public int addition(int a,int b) {

        int addition_of_two_numbers = a + b;

        return addition_of_two_numbers;

    }

    // Subtraction

    public int subtraction(int a,int b){

        int subtraction_of_two_numbers = a-b;

        return subtraction_of_two_numbers;

    }

    // Multiplication

    public int multiplication(int a,int b){

        int multiplication_of_two_numbers = a*b;

        return multiplication_of_two_numbers;

    }

    // Division

    public int division(int a,int b) {

        int division_of_two_numbers = a / b;

        return division_of_two_numbers;


    }


    // main method
    public static void main(String[] args) {

        // Created  Object of Scanner Class ---------classname object_name = new classname(System.in);
        // input stream as a parameter----System.in
        // System.in---- reads the input data from keyboard

        Scanner scanner = new Scanner(System.in);

        // First we will write message
        System.out.println("Please enter the value of a :");

        int a = scanner.nextInt();  // reads int input data
                                    // object_name.method_name
                                    // in Scanner Class , return type-------int-------method-----nextInt();
                                    // public int nextInt(){code}----- it is already created by java we will use only method
                                    // output of the function------return type------int-----stored in -------int a


        System.out.println("Please enter the value of b :");

        int b = scanner.nextInt();  // reads int input data
                                    // object_name.method_name
                                    // in Scanner Class , return type-------int-------method-----nextInt();
                                    // public int nextInt(){code}----- it is already created by java we will use only method
                                    // output of the function------return type------int-----stored in--------- int b

        // First, we will write a message for Choice Conditions
        System.out.println("Please enter choice :1 for Addition ,2 for Subtraction ,3 for Multiplication and 4 for Division ");

         int choice =  scanner.nextInt();  // reads int input data
                                           // object_name.method_name
                                           // in Scanner Class , return type-------int-------method-----nextInt();
                                           // public int nextInt(){code}----- it is already created by java we will use only method
                                           // output of the function------return type------int-----stored in--------- int choice







        // Step1 : Created object of main class------ CalculatorAppUsingScanner
        // classname object_name = new classname();

        CalculatorAppUsingScanner obj = new CalculatorAppUsingScanner();

        int result = 0;  //  declared the variable
                         // Syntax for variable-----Datatype variable_name = value;


        // if-else statement-----if(condition expression){code}else{code}
        // Step2: to call method----object_name.method_name();
        // stored the output of function in ------int result

       if(choice==1) {
           result = obj.addition(a, b); // reuse variable-----result
           System.out.println(" The addition of two numbers are :" + result);

       }
        else if(choice==2) {
           result = obj.subtraction(a, b); // reuse variable-----result
           System.out.println(" The subtraction of two numbers are :" + result);

       }
        else if(choice==3) {

           result = obj.multiplication(a, b); // reuse variable-----result
           System.out.println(" The multiplication of two numbers are :" + result);

       }
        else if(choice==4) {
           result = obj.division(a, b); // reuse variable-----result
           System.out.println(" The division of two numbers are :" + result);

       }


    }



}
