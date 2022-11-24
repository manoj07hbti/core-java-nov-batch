package dowhileloop;

public class EvenAndOddNumber {

    public static void main(String[] args) {
       // Write a program to print Even and odd number between 1 and 100

       int i = 1;

        // Applied increment do while loop,if-else statement and modulus operator

        do {
           if(i%2==0){

           System.out.println("This is an even number..."+i);
           }
            else{

            System.out.println("This is an odd number...."+i);

           }

            i++;

        }while(i<=100);





    }


}
