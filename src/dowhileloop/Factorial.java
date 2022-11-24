package dowhileloop;

public class Factorial {

    public static void main(String[] args) {

        // 5! = 5x4x3x2x1 = 120
        // 4! = 4x3x2x1   = 24


        int factorial =1;
        int i = 5; // similarly, for 4! we will put int i =4;

        do {
          factorial = factorial*i;
          System.out.println("Factorial of 5 is...."+factorial);
          i--;
        }while(i>0);





    }




}
