package oops.inheritance;

public class Dchild extends Dparent{
    public double add(double a, double b) {       // MULTI LEVEL POS
        // MULTIPLE INHERITANCE NOT POS (directly) DUE TO DIAMOND ERROR
        double c = a + b;                        // but can support multiple inheritance using interface concept
        return c;

    }

    public static void main(String[] args) {

        Dchild obj = new Dchild();
        double c = 0;
        c = obj.add(3, 4);
        System.out.println("SUM IS:" + c);


        c = obj.sub(5, 3);
        System.out.println("SUB is :" + c);

        c = obj.mul(7, 3);
        System.out.println("Multiply of number is :" + c);

        c = obj.div(4.2, 2.1);
        System.out.println("Division of number is :" + c);


    }
}

          //child can get property of parent
          // parent did not get property of child

