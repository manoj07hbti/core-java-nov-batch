package methods;

public class Calculator {

    //Addition
    public void add (){
        int a= 333;
        int b=123;
        int result = a+b;
        System.out.println("Addition of "+a+"+"+b+" = "+result);
    }
    // subtraction
    public void subtraction (){
        int a= 7854;
        int b=6644;
        int result = a-b;
        System.out.println("Subtraction of "+a+"-"+b+" = "+result);
    }
    // multiply
    public void multiply (){
        int a= 78;
        int b=64;
        int result = a*b;
        System.out.println("Multiplication of "+a+"*"+b+" = "+result);
    }
    // divide
    public void divide (){
        int a= 78;
        int b=64;
        double result = (double) a/b;
        System.out.println("Divide of "+a+"/"+b+" = "+result);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add();
        obj.subtraction();
        obj.multiply();
        obj.divide();
    }
}
