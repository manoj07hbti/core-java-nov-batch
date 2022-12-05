package method;

import java.util.Scanner;

public class Demoscanner {
    public int add(int a, int b){
        int result=a+b;
        return result;
    }
    public int minus(int a,int b){
        int minus=a-b;
        return minus;
    }
    public int multiply(int a,int b){
        int multiply=a*b;
        return multiply;
    }
    public int divide(int a,int b){
        int divide=a/b;
        return divide;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=scanner.nextInt();
        System.out.println("enter value of b");
        int b=scanner.nextInt();
        System.out.println("please enter the choice: 1 is add; 2 is minus; 3 is multiply; 4 is divide;");
        int choice=scanner.nextInt();

        Demoscanner obj=new Demoscanner();
        int result=0;
         switch(choice){
             case 1:result=obj.add(a,b);
                 System.out.println("answer is "+result);
                 break;
             case 2:result=obj.minus(a,b);
                 System.out.println("answer is "+result);
                 break;
             case 3:result=obj.multiply(a,b);
                 System.out.println("answer is "+result);
                 break;
             case 4:result=obj.divide(a,b);
                 System.out.println("answer is "+result);
             default:
                 System.out.println("invalid choice");
         }










    }
}
