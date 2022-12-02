package methods;

public class PrimeNumber {

    // Check Prime Number

    public void Prime( int num) {


        for (int i = 1; i <=num; i++) {
            if (num %2 == 0) {
                System.out.println(num + " Prime number");
            } else {
                System.out.println(num + " not Prime number");
            }
        }
    }

    public static void main(String[] args) {

        PrimeNumber obj = new PrimeNumber();
        obj.Prime(5 );
    }

}
