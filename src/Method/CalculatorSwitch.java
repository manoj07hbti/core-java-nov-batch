package Method;

import java.util.Scanner;

public class CalculatorSwitch {

    public int add(int a, int b) {
        int result = a + b;
        return result;

    }

    public int sub(int a, int b) {
        int result = a - b;
        return result;

    }

    public int multi(int a, int b) {
        int result = a * b;
        return result;
    }
    public int div(int a,int b){
        int result=a/b;
        return result;

    }
    public static void main(String[]args){
        Scanner calci=new Scanner(System.in);

        System.out.println(" Enter the Vale of a:");
        int a= calci.nextInt();

        System.out.println("Enter the value of b");
        int b=calci.nextInt();

        System.out.println("Enter the choice:"+"   1 for add"  +"   2 for sub"+"   3 for multi  "+"  4 for div");
        int choice= calci.nextInt();

        CalucatorApp css=new CalucatorApp();
        double result=0;

        CalculatorSwitch obj=new CalculatorSwitch();

        switch(choice){

            case 1:
            result= obj.add(a,b);
            System.out.println("Add is:"+result);
           break;
            case 2:
                result=obj.sub(a,b);
                System.out.println("Sub is:"+result);
                break;
            case 3:
                result=obj.multi(a,b);
                System.out.println("Multi is:"+result);
            case 4:
                result=obj.div(a,b);
                System.out.println("Div is:"+ result);


        }


    }
}
