package loops;

public class Factorial {

    public static void main(String[] args) {
// factor of 5
        int fact = 1;
        int i;
        for (i = 1; i <= 5; i++) {
            fact = fact * i;

        }
        System.out.println("factorial value of 5! is " + "=" + fact);
// factor of 4
        int facto=1;
        for (i = 1; i <= 4; i++) {
            facto = facto * i;
        }
        System.out.println("fractional value of 4! is " + "=" + facto);
    }
}

