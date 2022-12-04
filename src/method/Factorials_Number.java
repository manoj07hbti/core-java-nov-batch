package method;

public class Factorials_Number {

    // Factorial of 7

    public void Fact() {
        int i, fact = 1;
        int number = 7;

        for(i=1; i<=number; i++){
            fact=fact*i;
        }
        System.out.println("The factorial is.... " + fact);

    }

    public static void main(String[] args) {

        Factorials_Number obj =new Factorials_Number ();
        obj.Fact();

    }

}


