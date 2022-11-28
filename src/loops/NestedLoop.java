package loops;

public class NestedLoop {

    public static void main(String[] args) {


        for (int i=0; i<10; i++)
        {
            System.out.println("INSIDE LOOP "+i);

           for(int j=0; j<5;j++){

               System.out.println("THIS IS NESTED J LOOP "+j);
           }
        }

    }
}
