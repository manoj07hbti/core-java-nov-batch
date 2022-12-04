package functions_methods;

public class primeM {

    public void primeno(int n){

        boolean isPrime=false;

        for (int i=2; i<n; i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            else {
                isPrime=true;
            }
        }

        if(isPrime){
            System.out.println(n + " is Prime number ");
        }
        else {
            System.out.println(n + " is NOT Prime number ");
        }
    }

    public static void main(String[] args) {
        primeM obj = new primeM();
        obj.primeno(71);
    }

}
