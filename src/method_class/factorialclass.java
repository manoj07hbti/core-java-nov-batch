package method_class;

public class factorialclass {
    public void factorailmethod(){


        int fact=1;
       int i=5;
        while(i>0){
            fact=fact*i;
            i--;
        }
        System.out.println("factorial of 5 is"+fact);

    }

    public static void main(String[] args) {
        factorialclass obj=new factorialclass();
        obj.factorailmethod();

    }



}
