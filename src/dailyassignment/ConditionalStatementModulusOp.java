package dailyassignment;

public class ConditionalStatementModulusOp {

    public static void main(String[] args) {

        // Modulus Operator :  it will give remainder and symbol of this operator is-----%
        // Find out if a number is even or odd
        // first we will take a variable
        // Syntax for variable: Datatype variable_name = value;

        int number = 13;
        int output = number%2; // output---1------remainder

        // Apply if statement
        if(output==1){

          System.out.println("Number is odd......");

        }
         if(output!=1){

           System.out.println("Number is even......");
         }


         // Reuse variable and apply if-else statement

        number = 20;
         int output1 = number%2; // output1-----0---remainder

         if(output1==0){

          System.out.println("Number is even.....");

         }
         else{

             System.out.println("Number is odd.......");
         }




    }





}
