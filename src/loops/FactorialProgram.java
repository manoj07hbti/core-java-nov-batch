package loops;

public class FactorialProgram {
    public static void main(String[] args) {

        int i, fact=5;
        int number = 5;
        for(i=5; i>=number; i--) {
            fact = fact * 4 * 3 * 2;
        }
        System.out.println("factorial of "+number+" = "+fact);


    }
}
