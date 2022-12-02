package parameter_method;

public class calculator {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("sum is "+sum);
    }
    public void sub(int a,int b){
        int sub=a-b;
        System.out.println("sub is "+ sub);

    }
    public void multi(int a,int b){
        int multi=a*b;
        System.out.println("multiply is "+multi);

    }
    public void divide(double a, double b){
        double divide=(double)a/b;
        System.out.println("divide is " +divide);

    }

    public static void main(String[] args) {


        calculator obj = new calculator();
        obj.add(5,2);
        obj.add(5256,3265);
        obj.sub(5652,2222);
        obj.multi(1254,325);
        obj.divide(124548,3256);


    }
}