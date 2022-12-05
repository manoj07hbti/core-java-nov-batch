package methods;

public class CalcReturnType {
    public int add (int a, int b){
        int result = a+b;
        return result;
    }

    public int sub (int a, int b){
        int result = a-b;
        return result;
    }

    public int multiply (int a, int b){
        int result = a*b;
        return result;
    }

    public int div (int a, int b){
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        CalcReturnType obj = new CalcReturnType();
        int a = 9;
        int b = 1;
        int add = obj.add(a,b);
        System.out.println("Addition of Number : "+add); // how to print number a and b in result

        int sub = obj.sub(9,1);
        System.out.println("Addition of Number : "+sub);

        int mul = obj.multiply(9,1);
        System.out.println("Addition of Number : "+mul);

        int div = obj.div(9,3);
        System.out.println("Addition of Number : "+div);
    }
}
