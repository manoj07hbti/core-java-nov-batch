package loops;

public class DoWhileFact {
    public static void main(String[] args) {

        // FACTORIAL OF FIVE BY USING DO WHILE LOOP
        int i=5;
        int fact = 1;

        do {
            fact = fact * i;
            i--;
        }
        while (i > 0);
        System.out.println("factorial of 5 = " + fact);
    }
}
