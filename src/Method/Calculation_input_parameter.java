package Method;

public class Calculation_input_parameter {



         // addition parameter method

        public void addition(int m, int n){

            int result = m+n;

            System.out.println("sum of m&n is :"+result);
        }

    // subtraction parameter method
    public void subtraction(int a, int b){

        int result = a-b;

        System.out.println("subtraction of a&b is :"+result);

    }
    // multiple parameter method

    public void multiple (int m, int n){

        int result = m*n;

        System.out.println(" multiple of m&n is :"+result);
    }
    // divide parameter method

    public void divide (int m, int n){

        int result = m/n;

        System.out.println ("divide of m&n is :"+result);
    }
    // To calling the method

        public static void main(String[] args) {
            Calculation_input_parameter  obj= new Calculation_input_parameter();

            obj.addition(20,20);
            obj.addition(30,30);
            obj.addition(100,20);
            obj.subtraction(100,80);
            obj.subtraction(100,25);
            obj.subtraction(100,75) ;
            obj.multiple (100,5) ;
            obj.multiple(100,15) ;
            obj.multiple(100,25) ;
            obj.multiple(100,6) ;
            obj.divide(100,5) ;
            obj.divide(100,15) ;
            obj.divide(100,25) ;

        }
    }


