package Method;

public class Factorial {

    public void factorialmethod(){
         int fact=1;
         int i;
         for( i=5;i>=1; i--){

             fact=fact*i;

         }

         System.out.println("The factorial of  5 is:"+fact);


    }

    public static void main(String[]args) {

        Factorial obj = new Factorial();

        obj.factorialmethod();
    }
}
