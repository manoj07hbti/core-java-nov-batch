package methods;

public class Calculator {

    //add , sub , multi, divide

    public void addition(){

        int a=34;
        int b=33;

        int result= a+b;
        System.out.println("SUM is "+result);

    }

    //a-b
    //a*b
    //double result=(double)a/b;

    public void divide(){
        int a=324;
        int b =33;

        double result=(double) a/b;

        System.out.println("Divide is : "+result);

    }

    public static void main(String[] args) {

        Calculator obj= new Calculator();

        obj.addition();
        obj.divide();

    }

}
