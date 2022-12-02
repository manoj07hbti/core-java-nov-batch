package methods;

public class PrimeNumMethod {
    public void primenumber(int a){
        int check = 0;
        for (int i=2; i<a; i++){
            if (a%i==0){
                check+=1;
            }
        }
        if (check>0){
            System.out.println(a+ " is NOT a Prime Number");
        }else{
            System.out.println(a+ " is a Prime Number");
        }
    }

    public static void main(String[] args) {
        PrimeNumMethod obj = new PrimeNumMethod();
        obj.primenumber(6);
    }
}
