package forloop;

public class Day12_EvenOdd {
    // WAP to Print even and odd number between 1 and 100
    public static void main(String[] args) {

        for (int i=1; i<=100; i++){
            if (i%2 ==0){
                System.out.println(i+ " is Even Number ");
            }
            else{
                System.out.println(i+ " is Odd Number ");
            }
        }

    }
}
