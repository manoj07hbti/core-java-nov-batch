package dowhileloop;

public class TableOfFive {

    public static void main(String[] args) {

        /**
         *  Write a program to print the table of 5
         5x1=5, 5x2=10, 5x3=15, 5x4=20, 5x5=25, 5x6=30, 5x7=35, 5x8=40, 5x9=45, 5x10=50

         * Syntax of do while_loop :  do{
                                           code;
                                         increment(++) or decrement(--);
                                       } while(condition);

        **/

        // Applied increment do while loop
        int number = 5;
        int i= 1;
        int output;

        do {
          output = number*i;

            System.out.println(number +"x"+i+"="+output);
            i++;
        }while(i<=10);







    }




}
