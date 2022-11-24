package loops;

public class WhileLoopFact {
    public static void main(String[] args) {
        // FACTORIAL OF FIVE BY USING WHILE LOOP
        int i=5;
        int fact = 5;


        while (i >= 5) {
            fact = fact * 4 * 3* 2;

            System.out.println("factorial of 5 = " + fact);
            i--;
        }
    }
}
