package method;

public class Prime_Number {

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
            System.out.println("This is prime number........ " + number);
        }
        else {

            System.out.println("This is not  prime number.... " + number);
        }

    }


    public static void main(String[] args) {

        Prime_Number obj= new Prime_Number ();
        obj.prime(19);

        obj.prime(37);

        obj.prime(14);
    }
}

