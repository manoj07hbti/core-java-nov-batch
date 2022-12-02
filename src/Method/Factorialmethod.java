package Method;

public class Factorialmethod {
    // factorial
    public void factorial() {


        int i, fact = 1;
        int number = 10;

        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of 10 is :" + fact);

    }

    public void factorial2() {
        int i, factorials = 1;
        int number = 5;
        for (i = 1; i <= number; i++) {
            factorials = factorials * i;
        }
        System.out.println("Factorial of 5 is :" + factorials);

    }

    public void factorial3() {
        int i, factorials = 1;
        int number = 6;
        for (i = 1; i <= number; i++) {
            factorials = factorials * i;
        }
        System.out.println("Factorial of 6 is :" + factorials);
    }
        public static void main (String[]args){

            Factorialmethod obj = new Factorialmethod();
            obj.factorial();
            obj.factorial2();
            obj.factorial3();
        }
    }
