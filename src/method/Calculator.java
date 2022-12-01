package method;

public class Calculator {
    public void addition(){
        int a=25;
        int b=45;
        int result=a+b;
        System.out.println("addition is "+result);
    }
    public void subtraction(){
        int a=46;
        int b=38;
        int result=a-b;
        System.out.println("subtraction is "+result);
    }
    public void multiply(){
        int a=6;
        int b=6;
        int result=a*b;
        System.out.println("multiplication is "+result);
    }
    public void divide(){
        int a=12;
        int b=6;
        int result=a/b;
        System.out.println("dividation is "+result);
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.divide();
    }
}
