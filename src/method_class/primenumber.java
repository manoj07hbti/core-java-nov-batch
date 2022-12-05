package method_class;

public class primenumber {
    public void prime(int num){
        boolean isprime=false;
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            } else {
                isprime = true;
            }
        }
            if(isprime){
                System.out.println("number is  prime" +num);
            }else{
                System.out.println("number is not prime :" +num );
            }

    }

    public static void main(String[] args) {
        primenumber obj=new primenumber();
        obj.prime(5);
        obj.prime(6);
    }
}
