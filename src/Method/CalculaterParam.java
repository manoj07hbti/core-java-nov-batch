package Method;

public class CalculaterParam {


    public void addmethod(int a,int b){
        int result=a+b;
        System.out.println("The sum of the number is :"+result);
    }
    public void submethod(int a,int b){
        int result=a-b;
        System.out.println("The sub of the number is :"+result);
    }
    public void multmethod(int a,int b, int c){
        double result=(double)a*b*c;
        System.out.println("The multiply of the number is :"+result);
    }
    public void divmethod( double a, double b){
        double result=a/b;
        System.out.println("The div of the number is :"+result);
    }

    public static void main(String[]args){
         CalculaterParam obj=new CalculaterParam();

         obj.addmethod(7,8);
         obj.submethod(8,4);
         obj.multmethod(8,9,8);
         obj.divmethod(12,6);
    }
}
