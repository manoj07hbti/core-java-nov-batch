package dowhileloop;

public class Day13_Factorial {
                         /* Do while loop:
                         do {
                          CODE;
                          ++ or --;
                          } while(condition);       */
    //WAP to print factorial of 5 using decrement
                         public static void main(String[] args) {
                             int fact=1;
                             int i=5;
                             do {
                                 fact = fact*i;
                                 i--;
                             }while(i>0);
                             System.out.println("Factorial of 5 is 5X4X3X2X1 = "+fact);
                         }
}
