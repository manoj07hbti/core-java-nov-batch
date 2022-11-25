package loops;

public class EvenOdd {

    public static void main(String[] args) {

        int number=1;

        while (number<=100){

            if(number%2==0){

                System.out.println("Even number: "+number);
            }
            else {

                System.out.println("Odd number: "+number);
            }

            number++;

        }


    }
}
