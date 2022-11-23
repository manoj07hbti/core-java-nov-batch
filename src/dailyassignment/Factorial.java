package dailyassignment;

public class Factorial {

    public static void main(String[] args) {

        // Write a program to print the value of 4 factorial  and 5 factorial
        // 5! = 5x4x3x2x1= 120
        // 4! = 4x3x2x1 = 24



        // 5! = 5x4x3x2x1= 120
        // first we will take variable----number ,factorial
        // Syntax For_Loop: for(initialization; condition; increment/decrement){code}


        int number = 5;
        int factorial = 1;

        for(int i=5; i>0; i--){

          factorial =factorial*i;

         System.out.println("Factorial of 5 is..."+factorial);

        }

        // 4! = 4x3x2x1 = 24
        // first we will take variable----number1 ,factorial1
        // Syntax For_Loop: for(initialization; condition; increment/decrement){code}

        int number1 = 4;
        int factorial1 = 1;
        for(int i=4; i>0; i--){

            factorial1 =factorial1*i;

            System.out.println("Factorial of 4 is..."+factorial1);

        }




    }




}
