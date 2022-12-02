package methods;

public class CalculatorWithInputParameter {

   // Syntax For Method : access_specifier return_type  method or function_name(input parameter/optional){code}
    // Syntax For Method : access_specifier return_type  method or function_name(DataType variable_name1,DataType variable_name2------DataType variable_nameN ){code}

    // Parameter----- an input parameter that is optional--------DataType variable_name

    // Calculator------4 methods----- addition ,subtraction, multiplication  and division (divide)

    // Addition
    public  void addition(int a, int b){

        int result = a+b;

        System.out.println(" The addition of the two numbers are :"+result);


    }

    // Subtraction

    public  void subtraction(int a, int b){

        int result = a-b;

        System.out.println(" The subtraction of the two numbers are :"+result);


    }

    // Multiplication
    public  void multiplication(int a, int b){

        int result = a*b;

        System.out.println(" The multiplication of the two numbers are :"+result);


    }

    // Division/divide

    public  void division(int a, int b){

        int result = a/b;

        System.out.println(" The division of the two numbers are :"+result);


    }

// Division/divide using type casting
// Type Casting ------int(input)---------double(output) ,// double result =  (double) a/b;
    public  void division1(int a, int b){

        double result = (double) a/b;

        System.out.println(" The division of the two numbers are :"+result);


    }



    // Division/divide using
    // type casting --------- double(input)---------int(output), // int result = (int) ( a/b);
    public  void division2(double a, double b) {

        int result = (int) (a/b);

        System.out.println(" The division of the two numbers are :" + result);


    }



    // Main method to run program
    public static void main(String[] args) {

       // Step1: created an object of class(CalculatorWithInputParameter ) ---------classname object_name = new classname();

        CalculatorWithInputParameter obj = new CalculatorWithInputParameter();

       // Step2: To call method--------object_name.method_name();
        obj.addition(2,3);
        obj.addition(7,12);

        obj.subtraction(10,5);
        obj.subtraction(100,30);

        obj.multiplication(4,3);
        obj.multiplication(5,8);

        obj.division(100,20);
        obj.division(80,10);

        obj.division1(50,3);
        obj.division1(14,5);

        obj.division2(10.50,2.30);
        obj.division2(18.90,4.67);




    }





}
