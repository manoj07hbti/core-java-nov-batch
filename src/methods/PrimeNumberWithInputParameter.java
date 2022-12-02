package methods;

public class PrimeNumberWithInputParameter {

    // Syntax For Method : access_specifier return_type  method or function_name(input parameter/optional){code}
    // Syntax For Method : access_specifier return_type  method or function_name(DataType variable_name1,DataType variable_name2------DataType variable_nameN ){code}

    // Parameter----- an input parameter that is optional--------DataType variable_name

    // Prime number----A number is divided by 1 and itself------example--- 7 is divided by 1 and itself(7)
    // example---- 6 is divided by 1 ,2,3 and itself(6)--------6 is not prime number


    public void checkPrimeNumber(int number){

        int temp = 0; // we have taken a variable----temp

    // Used For_Loop : for (initialization; condition; increment or decrement) {code}
    // If Statement : if (condition expression) {code}
    // Modulus Operator----%---Symbol-----it gives the remainder
    // If-Else Statement :  if(condition expression){code} else {code}


        for(int i = 2; i<=number-1; i++){


            // If Statement : if (condition expression) {code}
            if (number%i==0) {

                temp = temp+1;


            }


        }

        // If-Else Statement :  if(condition expression){code} else {code}
        if(temp==0){

       System.out.println("This is prime number : "+number);

        }
         else{
            System.out.println("This is not prime number : "+number);

        }
    }


    // Main method to run program
    public static void main(String[] args) {

        // Step1: created an object of class(PrimeNumberWithInputParameter ) ---------classname object_name = new classname();

        PrimeNumberWithInputParameter obj = new PrimeNumberWithInputParameter();


        // Step2: To call method--------object_name.method_name();
        obj.checkPrimeNumber(7);
        obj.checkPrimeNumber(3);
        obj.checkPrimeNumber(5);

        obj.checkPrimeNumber(1);
        obj.checkPrimeNumber(6);
        obj.checkPrimeNumber(9);

        obj.checkPrimeNumber(11);

    }




}
