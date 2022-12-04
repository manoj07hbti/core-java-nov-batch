package functions_methods;

public class CalciM {

    public void addition(int a,int b){
        int sum= a+b;
        System.out.println("the sum of two numbers is " + sum);
    }
    public void subtraction(int x, int y){
        int sub= x-y;
        System.out.println("the sub of two numbers is " + sub);
    }
    public void multiply(int a, int b ){
        int mul= a*b;
        System.out.println("product of two numbers is " + mul);
    }
    public void divide (int s, int d){
        double divide=(double)s/d;
        System.out.println("divide of two no. is " + divide);
    }

    public static void main(String[] args) {
        CalciM obj =new CalciM();
        obj.addition(10,20);
        obj.subtraction(39,10);
        obj.multiply(20,9);
        obj.divide(31,5);
    }
}
