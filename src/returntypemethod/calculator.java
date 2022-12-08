package returntypemethod;

public class calculator {
    public int calculator(int a,int b){
        int sum =a+b;
        return sum;
    }
    public int multi(int a, int b) {
        int multi = a * b;
        return multi;
    }
    public double divide(int a,int b){
        double divide = (double)a/b;
        return divide;
    }
    public int sub(int a,int b){
       int sub=a-b;
        return sub;
    }

    public static void main(String[] args) {
        calculator obj=new calculator();
        int sum=obj.calculator(55,365);
        System.out.println(sum);
        int multi=obj.multi(65,58);
        System.out.println("multiplication is: "+multi );
        double divide=obj.divide(54578,55);
        System.out.println("divide is :"+divide);
        int sub=obj.sub(58977,365);
        System.out.println("subtraction nis :"+sub);
    }



}
