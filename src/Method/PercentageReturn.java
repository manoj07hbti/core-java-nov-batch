package Method;

public class PercentageReturn {
    public double pecentagemethod(double a,double b){

        double result=a/b*100;

        return result;
    }
     public static void main(String[]args){

        PercentageReturn obj=new PercentageReturn();

        double result=obj.pecentagemethod(12.5,60);

        System.out.println("The percentage of A with respect to B is :"+result);
     }


}
