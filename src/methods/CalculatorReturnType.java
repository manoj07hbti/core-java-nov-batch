package methods;

public class CalculatorReturnType {

    // Syntax for Method: access_specifier return_type method or function_name (parameter){code}
    // Syntax For Method : access_specifier return_type  method or function_name(DataType variable_name1,DataType variable_name2------DataType variable_nameN ){code}
    // Parameter--------an input parameter that is optional
    // calculator---- 4 methods-------addition,subtraction,multiplication,division/divide
    // Return type---- out put of the function or method ---------int , input parameter------data type variable_name1, data type variable_name2 ---------int a,int b



  // Addition
    public int addition (int a ,int b){

        int addition_of_two_numbers =  a+b;
        return addition_of_two_numbers; //  output of function


    }

    // Subtraction

    public int subtraction (int a ,int b){

        int subtraction_of_two_numbers =  a-b;
        return subtraction_of_two_numbers; //  output of function


    }

   // Multiplication

    public int multiplication (int a ,int b){

        int multiplication_of_two_numbers =  a*b;
        return multiplication_of_two_numbers; //  output of function


    }

   // Division

    public int division (int a ,int b){

        int division_of_two_numbers =  a/b;
        return division_of_two_numbers; //  output of function


    }



    // Main method to run program
    public static void main(String[] args) {

        // Step1: created an object of class (CalculatorReturnType)  ---------classname object_name = new class_name();

        CalculatorReturnType obj = new CalculatorReturnType();

        // Step2: To call method-------object_name.method_name();
       int result = obj.addition(3,5); // output of function-------addition_of_two_numbers-------a+b------stored in------result

       // Print the output
        System.out.println("The addition of two numbers are :"+result);

        int result1 = obj.addition(10,15);
        System.out.println("The addition of two numbers are :"+result1);


        int result2 =  obj.subtraction(10,7);
        System.out.println("The subtraction of two numbers are :"+result2);

        int result3 =  obj.subtraction(40,18);
        System.out.println("The subtraction of two numbers are :"+result3);


        int result4 =  obj.multiplication(7,5);
        System.out.println("The multiplication of two numbers are :"+result4);

        int result5 =  obj.multiplication(4,6);
        System.out.println("The multiplication of two numbers are :"+result5);



        int result6 =  obj.division(20,5);
        System.out.println("The division of two numbers are :"+result6);

        int result7 =  obj.division(150,75);
        System.out.println("The division of two numbers are :"+result7);

    }






}
