package Method;

public class CalciReturn {



    public int addmethod(int a,int b) {

        int result = a + b;
        return result;
    }
    public int submethod(int a ,int b){

        int sub= a-b;
        return sub;
    }
    public int multimethod(int a ,int b){
        int multi=a*b;
        return multi;
    }
    public double divmethod( int a, int b){
        int div=a/b;
        return div;
    }
  public static void main(String[]args){
         CalciReturn obj=new CalciReturn();

         int result=obj.addmethod(4,9);

         System.out.println("The sum of the given number is :"+result);

          int sub=obj.submethod(4,2);
          System.out.println("The sub of the given number is :"+sub);

          int multi=obj.multimethod(3,3);
          System.out.println("The multiply of the given two number is:"+multi);

          double div=obj.divmethod(60,12);
          System.out.println("The division of the numbers is:"+div);

  }
}