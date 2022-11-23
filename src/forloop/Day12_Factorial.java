package forloop;

public class Day12_Factorial {
    public static void main(String[] args) {
        // WAP to print factorial of 5 using decrement
        int fact=1;
        for (int i=5; i>0; i--){
            fact= fact*i;

        }
        System.out.println("Factorial of 5 is " +fact);

        // trying to print factorial of 5 using increment

        fact=1;
        for (int i=1; i<=5; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of 5 is " +fact);
    }


}
