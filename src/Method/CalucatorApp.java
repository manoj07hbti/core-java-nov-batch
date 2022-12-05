package Method;

import java.util.Scanner;

public class CalucatorApp {

    public int addmethod(int a,int b){
        int result=a+b;
        return result;

    }
    public int submethod(int a,int b){
        int result=a-b;
        return result;

    }
    public int multimethod(int a, int b){
        int result=a*b;
        return result;

    }
    public double divmethod(double a,double b){
        double result=a/b;
        return result;
    }

    public static void main(String[]args){

        Scanner cal=new Scanner(System.in);

        System.out.println("Enter the value of A:");
        int a= cal.nextInt();

        System.out.println("Enter the value of B:");
        int b= cal.nextInt();

       System.out.println("Enter the choice:"+ "\n  1 for add"+" \n  2 for sub"+" \n  3 for multi  "+"\n  4 for div");
        int choice= cal.nextInt();

        CalucatorApp css=new CalucatorApp();
        double result=0;


        if(choice==1){
            result= css.addmethod(a,b);
            System.out.println("SUM IS:"+result);
        }
        else if(choice==2){
            result= css.submethod(a,b);
            System.out.println("SUB IS:"+result);
        }
        else if(choice==3){
            result= css.multimethod(a,b);
            System.out.println("MULTIPLY IS:"+result);
        }
        else if(choice==4) {
            result = css.divmethod(a,b);
            System.out.println("DIVISION IS :"+result);
        }
    }

}
