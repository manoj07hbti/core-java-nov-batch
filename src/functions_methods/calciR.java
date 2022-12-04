package functions_methods;

public class calciR {
    //add,sub,mul,divide

    //add
    public int addition ( int a , int b){
        int sum = a+ b;
        return sum;
    }
    //sub

    public int subtraction (int a , int b ){
        int sub = a-b;
        return sub;

    }
    //multi
    public int multiply (int a,int b){
        int mul = a*b;
        return mul;
    }
    //divide
    public double divide ( int a , int b ){

        double divide = (double) a/b;
        return divide;
    }

    public static void main(String[] args) {
        calciR obj = new calciR();
        int sum = obj.addition(10,20);
        System.out.println("Addition of two numbers is "+ sum);

        int sub = obj.subtraction(23,10);
        System.out.println("Subtraction of two numbers is  "+ sub);

        int mul = obj.multiply(10,40);
        System.out.println("product of two numbers is  "+ mul);

        double divide = obj.divide(45,10);
        System.out.println("Division of two numbers is  "+ divide);
    }
}
