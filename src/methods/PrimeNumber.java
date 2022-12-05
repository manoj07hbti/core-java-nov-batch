package methods;

public class PrimeNumber {

    // Check Prime Number
    public void Prime( int num) {

        boolean isPrime = false;
        for (int i =2; i <num; i++) {
            if (num % i == 0) {

                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }

        if(isPrime) {
            System.out.println(num+" is Prime Number");
        }
        else {
            System.out.println(num+" is not prime number");
        }
    }

    public static void main(String[] args) {

        PrimeNumber obj = new PrimeNumber();
        obj.Prime(5 );
        obj.Prime(8);
        obj.Prime(13);
    }

}
