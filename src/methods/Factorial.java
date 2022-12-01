package methods;

public class Factorial {

    // Factorial of 5

    public void Fact() {
        int i, fact = 1;
        int number = 5;

        for(i=1; i<=number; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of 5 is :"+fact);

    }

    public static void main(String[] args) {

        Factorial obj =new Factorial();
        obj.Fact();

    }

}
