package loops_day_1;

public class Factorial_For_Loops {

    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        for(int i=5; i>0; i--){

            factorial =factorial*i;

            System.out.println("Factorial of 5 is..."+factorial);

        }

        int numbers = 4;
        int factorials = 1;

        for(int i=4; i>0; i--){

            factorials =factorials*i;

            System.out.println("Factorial of 4 is..."+factorials);

        }

    }
}
