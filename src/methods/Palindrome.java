package methods;

public class Palindrome {

    // Syntax for method: access_specifier return_type  method or function_name (input parameter/optional){code}

    public void checkPalindromeNumber(){

    // We will take variable---number ,temp,reverse ,remainder
    // original number 121----reverse---- reverse number 121------> original number = reverse number -------palindrome number
    // 122-----reverse-----221-----> original number != reverse number    not palindrome number

    int number = 121;   // similarly, we can take any number----int number = 122;
    int temp = number; // stored the original number(121) in temp
    int reverse = 0,remainder;

   /** Syntax for while_loop-----while(condition){
                             code;

                             increment or decrement;
               }
        **/

    // Using while_loop

        while(temp!=0){

         remainder = temp%10; // %-----modulus operator
         reverse  =  reverse*10+remainder;
         temp = temp/10;


        }

       // Using if-else statement: if( condition expression){code} else{code}
        // == -------equal equal operator or double equal operator

       if(number==reverse){

           System.out.println("Number is palindrome.... "+number);
       }
         else{

           System.out.println("Number is not palindrome.... "+number);

       }



    }
    // Main method to run program---psvm(String[] args){}

    public static void main(String[] args) {
        // Step1: Created an object of class(Calculator)-------classname object_name = new classname();

        Palindrome palindrome = new Palindrome();

        // Step2: To call method-------object_name.method_name
        palindrome.checkPalindromeNumber();

    }








}
