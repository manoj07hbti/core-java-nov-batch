package loops;

public class WhileLoopFact {
    public static void main(String[] args) {
        // FACTORIAL OF FIVE BY USING WHILE LOOP
        int i=5;
        int fact = 1;


        while (i > 0) {
            fact = fact * i;

            System.out.println("factorial of 5 = " + fact);
            i--;
        }
    }
}
