package methods;

public class CubeReturnType {

   // Syntax for Method: access_specifier return_type method or function_name (parameter){code}
    // Syntax For Method : access_specifier return_type  method or function_name(DataType variable_name1,DataType variable_name2------DataType variable_nameN ){code}
    // Parameter--------an input parameter that is optional

   // Write a program to find the cube of any number
    // number = 3 ,cube of number = number *number*number = 3*3*3 = 27

    // Return type---- out put of the function or method ---------int , input parameter------data type variable_name ---------int number

    public int cube (int number){

        int cube_of_number = number*number*number;

        return cube_of_number; // output of function




    }

    // Main method to run program
    public static void main(String[] args) {

      // Step1: created an object of class ( CubeReturnType )  ---------classname object_name = new class_name();

        CubeReturnType obj = new CubeReturnType();

        // Step2: To call method-------object_name.method_name();

        int result =   obj.cube(3); // output of function------------cube_of_number------- stored in--------int result

        System.out.println(" Cube of 3 is :"+ result);

        int result1 =   obj.cube(5);

        System.out.println(" Cube of 5 is :"+ result1);


        int result2=   obj.cube(11);

        System.out.println(" Cube of 11 is :"+ result2);





    }




}
