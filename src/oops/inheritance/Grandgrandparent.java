package oops.inheritance;

public class Grandgrandparent  {

    public double div(double a, double b) {       // MULTI LEVEL POS
                                                 // MULTIPLE INHERITANCE NOT POS (directly) DUE TO DIAMOND ERROR
        double c = a / b;                        // but can support multiple inheritance using interface concept
        return c;

    }

    public static void main(String[] args) {

        Grandgrandparent obj = new Grandgrandparent();
        double c = 0;
        c = obj.div(12, 4);
        System.out.println("SUM IS:" + c);





    }
}
