package whileloop;

public class EvenAndOddNumber {

    public static void main(String[] args) {

     /**
         * Write a program to print Even and odd number between 1 and 100
         * Syntax for if-else statement :if(condition){code}else{code}
         * Modulus Operator :  it will give remainder and symbol of this operator is-----%
         * Syntax of while_loop : while(condition){
                                        code;
                                       increment(++) or decrement(--);
                                  }
              **/



        int i = 1;

        // Applied increment while loop
        while (i<=100){

            if(i%2 == 0){

                System.out.println("THIS IS EVEN NUMBER....."+i);
            }
            else{

                System.out.println("THIS IS ODD NUMBER...."+i);
            }

            i++;


        }

    }



}
