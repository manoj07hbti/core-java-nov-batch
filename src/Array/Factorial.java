package Array;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial is " + factorial);

        int digit = 6;
        factorial = 1;

        for (int i = digit; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is " + factorial);

        int num = 7;
        factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }

            System.out.println("Factorial is " + factorial);

        }
    }

