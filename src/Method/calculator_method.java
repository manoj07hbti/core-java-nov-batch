package Method;

public class calculator_method {
        public void addition() {
// addition

        int a = 25;
        int b = 75;
        int c = 25;
        int result = a + b + c;
        System.out.println("Result of it " + result);
    }
    // multiple

    public void multiple() {
        int a = 5;
        int b = 15;
        int c = 5;
        int result = a*b*c;
        System.out.println("Result of it  is " + result);
    }
    // Division
    public void division() {

        int p = 25;
        int f = 6;
        double result =(double) p / f;
        System.out.println("result of it is " +result);
    }


   // subtraction
    public void subtraction(){
            int a =100;
            int b= 20;
            int result= a-b;
        System.out.println("result of it is "+ result);
    }


    public static void main (String[]args){
            calculator_method obj = new calculator_method();
            obj.addition();
            obj.multiple();
            obj.division();
            obj.subtraction();
        }
    }





