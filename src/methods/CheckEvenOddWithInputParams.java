package methods;

public class CheckEvenOddWithInputParams {

    // Syntax For Method : access_specifier return_type  method or function_name(input parameter/optional){code}
    // Syntax For Method : access_specifier return_type  method or function_name(DataType variable_name1,DataType variable_name2------DataType variable_nameN ){code}

    // Parameter----- an input parameter that is optional--------DataType variable_name

    public void evenOdd(int number){

    // Used if-else statement :if(condition expression){code}else{code}
    // Used modulus operator : %-------it gives remainder ------number%2
        if(number%2==0){

         System.out.println("This is an even number....."+number);

        }
         else {
            System.out.println("This is  an odd number....."+number);

        }

    }

    // Main method to run program
    public static void main(String[] args) {

        // Step1: created an object of class(CheckEvenOddWithInputParams ) ---------classname object_name = new classname();
        CheckEvenOddWithInputParams obj = new CheckEvenOddWithInputParams();

        // Step2: To call method--------object_name.method_name();

        obj.evenOdd(2);
        obj.evenOdd(4);

        obj.evenOdd(8);
        obj.evenOdd(16);

        obj.evenOdd(17);
        obj.evenOdd(23);

        obj.evenOdd(100);
        obj.evenOdd(111);



    }



}
