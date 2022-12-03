package methods;

public class PrimeNumber {


    public void prime(int number){

       boolean isPrime=false;

        for (int i=2; i<number; i++){

            if(number%i==0){

                isPrime=false;
                break;
            }
            else {
                isPrime=true;

            }


        }

        if(isPrime){
            System.out.println("Number is Prime number :"+number);
        }
        else {

            System.out.println("Number is NOT Prime number: "+number);
        }

    }


    public static void main(String[] args) {

        PrimeNumber obj= new PrimeNumber();
        obj.prime(7);

        obj.prime(11);

        obj.prime(15);
    }
}
