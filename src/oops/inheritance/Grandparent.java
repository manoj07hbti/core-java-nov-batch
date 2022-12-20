package oops.inheritance;

public class Grandparent extends Grandgrandparent {

    public int mul(int a, int b) {
        int c = a * b;


        return c;


    }

    public static void main(String[] args) {

        Grandparent obj = new Grandparent();
        double c = 0;


        c = obj.div(12, 4);
        System.out.println("SUB is :" + c);

        c = obj.mul(5, 7);
        System.out.println("Multiply of number is :" + c);


    }
}

