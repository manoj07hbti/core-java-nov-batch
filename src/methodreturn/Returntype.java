package methodreturn;

public class Returntype {
    public int cube(int number){
        int cube=number*number*number;
        return cube;
    }
    public int percentage(int number,int percentage){
        int result=(number*percentage)/100;
        return result;
    }
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int minus(int a , int b){
        int minus=a-b;
        return minus;
    }
    public int multiply(int a,int b){
        int result=a*b;
        return result;
    }
    public double divide(int a,int b){
        double divide=a/b;
        return divide;
    }



    public static void main(String[] args) {
        Returntype obj=new Returntype();
        int cube=obj.cube(6);
        System.out.println("cube is "+cube );
        int result=obj.percentage(20,5);
        System.out.println("percentage of 20 is "+result );
        int sum=obj.add(10,10);
        System.out.println("addition is "+sum);
        int minus=obj.minus(15,5);
        System.out.println("minus is "+minus );
        int multiply =obj.multiply(5,6);
        System.out.println("answer is "+ multiply);
        double divide=obj.divide(12,7);
        System.out.println("answer is "+divide);
    }
}
