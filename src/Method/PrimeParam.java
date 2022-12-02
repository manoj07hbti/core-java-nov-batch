package Method;

public class PrimeParam {

    public void primemethod(int a) {
        int number = 0;
        for (int i=2; i<a; i++){
            if (a%i==0){
                number+=1;
            }
        }
        if (number>0){
            System.out.println(a+ " is NOT a Prime Number");
        }else{
            System.out.println(a+ " is a Prime Number");
        }
    }
            public static void main (String[]args){

        PrimeParam obj=new PrimeParam();

        obj.primemethod(7);

            }

        }


