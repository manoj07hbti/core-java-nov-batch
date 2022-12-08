package scannermethod;

import java.util.Scanner;

public class calc {
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

    public double divide(int a, int b) {
        double output = (double) a / b;
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flag="y";
        while(flag.equals("y")) {


            System.out.println("value of a : ");
            int a = scanner.nextInt();
            System.out.println("value of b: ");
            int b = scanner.nextInt();
            System.out.println("please enter choice: 1 for addition, 2 for substraction ,3 for multiplication ,4 for divide");
            int choice = scanner.nextInt();

            calc obj = new calc();

            int result = 0;
            if (choice == 1) {
                result = obj.add(a, b);
                System.out.println("sum is :" + result);
            } else if (choice == 2) {
                result = obj.sub(a, b);
                System.out.println("sub is : " + result);
            } else if (choice == 3) {
                result = obj.multi(a, b);
                System.out.println("multiply  is : " + result);
            } else if (choice == 4) {
                double output = obj.divide(a, b);
                System.out.println("multiply  is : " + result);
            } else {
                System.out.println("invalid number : please enter correct number");
            }
            Scanner scanner2=new Scanner(System.in);
            System.out.println("do u want to continue : press y for continue or press any key for exit");
            flag=scanner2.nextLine();


        }
    }
}





