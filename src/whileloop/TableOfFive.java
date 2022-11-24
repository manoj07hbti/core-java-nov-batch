package whileloop;

public class TableOfFive {

    public static void main(String[] args) {

        /**
         *  Write a program to print the table of 5
         5x1=5, 5x2=10, 5x3=15, 5x4=20, 5x5=25, 5x6=30, 5x7=35, 5x8=40, 5x9=45, 5x10=50

         *  first we will take variable------number,i,output
         *  Syntax for Variable : Datatype variable_name = value;

         * Syntax of while_loop : while(condition){
                                 code;
                               increment(++) or decrement(--);
                             }
         **/


         int number = 5; // similarly ,we can take int number = 3; for getting the table of 3
         int i = 1;
         int output;

        // Applied increment while loop
          while(i<=10){

             output = number*i;
           System.out.println(number + "x" + i +"="+ output);
             i++;

          }















    }




}
