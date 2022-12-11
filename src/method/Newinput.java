package method;

public class Newinput {
    public void addition(int a, int b){
        int sum=a+b;
        System.out.println("answer is "+sum);
    }
    public void minus(int a,int b){
        int minus=a-b;
        System.out.println("answer is "+minus);
    }
    public void cube(int number){
        int cube=number*number*number;
        System.out.println("cube is "+cube);
    }
    public void divide(int a,int b){
        int divide=a/b;
        System.out.println("answer is "+divide);
    }

    public static void main(String[] args) {
        Newinput obj=new Newinput();
        obj.addition(8,9);
        obj.minus(12,9);
        obj.cube(5);
        obj.divide(6,3);
    }
}
