package methods;

public class CalcInputMethod {
    //Addition
    public void add (int a, int b){
        int result = a+b;
        System.out.println("Addition of "+a+"+"+b+" = "+result);
    }
    // subtraction
    public void subtraction (int a, int b){

        int result = a-b;
        System.out.println("Subtraction of "+a+"-"+b+" = "+result);
    }
    // multiply
    public void multiply (int a, int b){

        int result = a*b;
        System.out.println("Multiplication of "+a+"*"+b+" = "+result);
    }
    // divide
    public void divide (int a, int b){

        double result = (double) a/b;
        System.out.println("Divide of "+a+"/"+b+" = "+result);
    }

    public static void main(String[] args) {
        CalcInputMethod obj = new CalcInputMethod();
        obj.add(15,15);
        obj.subtraction(50,20);
        obj.multiply(6,5);
        obj.divide(60,2);
    }
}
