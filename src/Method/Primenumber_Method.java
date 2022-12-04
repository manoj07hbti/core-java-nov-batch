package Method;

public class Primenumber_Method {
    public void prime(int number) {
        boolean isprime = false;
        for (int i = 2; i < number; i++) {
            if (number % i== 0) {
                isprime = false;
                break;
            } else {
                isprime = true;
            }
        }
        if (isprime) {
            System.out.println("Number is prime " + number);
        } else {
            System.out.println("number is not prime number " + number);
        }
    }


    public static void main(String[] args) {
        Primenumber_Method obj = new Primenumber_Method ();
        obj.prime(11);
        obj.prime(17);
        obj.prime(29);
        obj.prime(31);

    }
}

