package loops;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 2;
        for (int j = 0; j <= 100; j++) {

            if(j%number==0){
                System.out.println("your number is even"+j);
            }
            if(j%number==1){
                System.out.println("your number is odd"+j);
            }
        }
    }
}
