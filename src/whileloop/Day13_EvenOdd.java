package whileloop;

public class Day13_EvenOdd {
    public static void main(String[] args) {
                         /* while(condition){
                         CODE;
                         ++ or -- ;
                         }                */
        // WAP to Print even and odd number between 1 and 100
        int i = 0;
        while(i<100){
            i++;
            if (i%2==0){
                System.out.println(i+ " is Even Number ");

            }else {
                System.out.println(i + " is Odd Number ");
            }
        }
    }
}
