package functions_methods;

public class CalculatorM {

    //add,sub,multi,divide

    public void add(){
        int a=12;
        int b=10;

        int sum= a+b;

        System.out.println("Sum of two numbers = " + sum);
    }
    public void sub(){
        int x=36;
        int y= 12;

        int sub =x-y;
        System.out.println("Subtraction of two numbers = " + sub);
    }
    public void multiply(){
        int a=10;
        int b=16;

        int mumtiply = a*b;
        System.out.println("Multiply of two numbers = " + mumtiply);
    }
    public void divide(){
        int q=34;
        int z=3;

        double divide = (double) q/z;
        System.out.println("Division of two numbers then result will be = " + divide);
    }

    public static void main(String[] args) {
        CalculatorM obj=new CalculatorM();
        obj.add();
        obj.sub();
        obj.multiply();
        obj.divide();
    }


}
