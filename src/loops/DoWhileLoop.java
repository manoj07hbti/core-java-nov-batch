package loops;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i=0;

        do{

            System.out.println("This is do while loop "+i);
            i++;
        }
        while ( i<5 );

        i=10;

        do{
            System.out.println("This is decrement do while loop "+i);
            i--;
        }
        while (i>0);

    }
}
