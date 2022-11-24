package loops;

public class factorial {
    public static void main(String[] args) {

        int i;
        int n=3;
        int f=1;

        for (i=n; i>0; i--){
            f=f*i;
        }
        System.out.println("Factorial is " +f);


    }
}
