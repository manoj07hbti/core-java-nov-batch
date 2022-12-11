package methodreturn;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b){
        int result=a+b;
        return result;
    }
    public int minus(int a,int b){
        int result=a-b;
        return result;
    }
    public int multiply(int a,int b){
        int result=a*b;
        return result;
    }
    public int divide(int a,int b){
        int result=a/b;
        return result;
    }

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String flag="y";
    while(flag.equals("y")){

        System.out.println("enter the value of a");
        int a=scanner.nextInt();
        System.out.println("enter the value of b");
        int b=scanner.nextInt();
        System.out.println("enter the choice: 1 for add, 2 for minus, 3 for multiply, 4 for divide,");
        Scanner scanner1=new Scanner(System.in);
        int choice=scanner.nextInt();




        Calculator obj=new Calculator();
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
                break;
            default:
                System.out.println("invalid");

        }
        System.out.println("do u want to continue press: y or press any key for exit");
       flag= scanner1.nextLine();
    }






    }





}
