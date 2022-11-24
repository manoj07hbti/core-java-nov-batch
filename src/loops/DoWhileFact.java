package loops;

public class DoWhileFact {
    public static void main(String[] args) {

        // FACTORIAL OF FIVE BY USING DO WHILE LOOP
        int i=5;
        int fact = 5;

        do {
            fact = fact * 4 * 3* 2;

            System.out.println("factorial of 5 = " + fact);
            i--;
        }
        while (i >= 5);
    }
}
