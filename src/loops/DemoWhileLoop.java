package loops;

public class DemoWhileLoop {

    public static void main(String[] args) {

        int i=0;

        while( i<10 ){

         System.out.println(" Increment While Loop "+i);
         i++;
        }

        i=10;

        while (i>0){

            System.out.println("Decrement while loop "+i);
            i--;
        }



        //INFINITE LOOP

    /*  while ( i>=0 ){

          System.out.println("INFINITE LOOP "+i);
          i++;
      }*/


    }
}
