package whileloop;

public class Day13_Factorial {
    public static void main(String[] args) {
        // WAP to print factorial of 5 using decrement
        int fact=1;
        int i=5;
        while(i>0){
            fact = fact*i;
            i--;
        }
        System.out.println("Factorial of 5 is 5X4X3X2X1 = "+fact);
    }
}
