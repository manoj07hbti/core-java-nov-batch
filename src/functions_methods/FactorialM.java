package functions_methods;

public class FactorialM {

    public void factorialmethod(){

        int i;
        int n=5;
        int f=1;

        for (i=n; i>=1; i--){
            f=f*i;
        }
        System.out.println("Factorial of 5 is = "+f);
    }

    public static void main(String[] args) {
        FactorialM obj = new FactorialM();
        obj.factorialmethod();
    }
}
