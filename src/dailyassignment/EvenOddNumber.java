package dailyassignment;

public class EvenOddNumber {

    public static void main(String[] args) {

       // Write a program to print Even and odd number between 1 and 100

        // Syntax For_Loop: for(initialization; condition; increment/decrement){code}
        //Syntax for if-else statement :if(condition){code}else{code}
        // Modulus Operator :  it will give remainder and symbol of this operator is-----%

        for(int i= 1; i<=100 ;i++  ){


            if(i%2 == 0){

                System.out.println("THIS IS EVEN NUMBER....."+i);
            }
             else{

                 System.out.println("THIS IS ODD NUMBER...."+i);
            }



        }



    }



}
