package oops.inheritance;

public class Dparent extends Grandparent{


        public int sub(int a, int b) {
            int c = a - b;


            return c;


        }

        public static void main(String[] args) {

            Dparent obj = new Dparent();
            double c = 0;



            c = obj.sub(5, 3);
            System.out.println("SUB is :" + c);

            c = obj.mul(5, 7);
            System.out.println("Multiply of number is :" + c);


        }
    }


