package loops;

public class FactorialDoWhile {

    public static void main(String[] args) {

        int number =5;

        int factorial=1;

        do{
            factorial= number*factorial;

            number --;
        } while(number>0);

        System.out.println("Factorial of number  is :"+factorial);





    }


}
