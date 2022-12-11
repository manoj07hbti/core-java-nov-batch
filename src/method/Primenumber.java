package method;

public class Primenumber {
    public void prime(int number){

        for(int i=2; i<number; i++){

        if(number%i==0){
            System.out.println("number is not prime number"+number);
            break;
        }else{
            System.out.println("number is prime "+number);
            break;
        }

    }
}

    public static void main(String[] args) {
        Primenumber obj=new Primenumber();
        obj.prime(7);
    }
}
