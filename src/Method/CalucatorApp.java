package Method;

import java.util.Scanner;

public class CalucatorApp {

    public int addmethod(int a, int b) {
        int result = a + b;
        return result;

    }

    public int submethod(int a, int b) {
        int result = a - b;
        return result;

    }

    public int multimethod(int a, int b) {
        int result = a * b;
        return result;

    }

    public double divmethod(double a, double b) {
        double result = a / b;
        return result;
    }

    public static void main(String[] args) {

        Scanner cal = new Scanner(System.in);

        String flag = "y";
        while (flag.equals("y")) {


            System.out.println("Enter the value of A:");
            int a = cal.nextInt();

            System.out.println("Enter the value of B:");
            int b = cal.nextInt();

            System.out.println("Enter the choice:" + "\n  1 for add" + " \n  2 for sub" + " \n  3 for multi  " + "\n  4 for div");
            Scanner obj=new Scanner(System.in);
            String choice= obj.nextLine();

            CalucatorApp css = new CalucatorApp();
            double result = 0;




            if (choice.equals(1) ) {
                result = css.addmethod(a, b);
                System.out.println("SUM IS:" + result);
            } else if (choice.equals(2)) {
                result = css.submethod(a, b);
                System.out.println("SUB IS:" + result);
            } else if (choice.equals(3) ) {
                result = css.multimethod(a, b);
                System.out.println("MULTIPLY IS:" + result);
            } else if (choice.equals(4)) {
                result = css.divmethod(a, b);
                System.out.println("DIVISION IS :" + result);
            }

            System.out.println("choose y for continue and choose any key to exit");

            flag= obj.nextLine();
        }
        System.out.println("Thanks for using calculator");

    }
}
