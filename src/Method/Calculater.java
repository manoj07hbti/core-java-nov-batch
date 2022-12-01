package Method;

public class Calculater {

    public void summethod(){
        int a=3;
        int b=4;
        int result=a+b;
        System.out.println("The sum of two number is :"+result);
    }

    public void submethod(){
        int a=7;
        int b=2;
        int result=a-b;
        System.out.println("The sub of ur number is :"+result);

    }
    public void mulmethod(){

        int a=3;
        int b=4;
         int result=a*b;

         System.out.println("The multiply of the number is :"+"/n"+result);
    }
    public void divmethod(){

        int a=13;
        int b=6;
        double result=(double)a/b;
        System.out.println("The result of div is:"+"/t"+result);
    }

    public static void main(String[]args){

        Calculater obj= new Calculater();
        obj.summethod();
        obj.submethod();
        obj.mulmethod();
        obj.divmethod();
    }
}
