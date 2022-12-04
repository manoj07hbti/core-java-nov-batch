package Method;

public class Calculator_returntype {
    // Syntax:access_specifier return_type method_name(parameter){code}

    public int addition(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public int Subtraction(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int Multiple(int a, int b) {
        int Multi = a * b;
        return Multi;
    }

    public int division(int a, int b) {
        int divi = a / b;
        return divi;
    }

    public static void main(String[] args) {


        Calculator_returntype obj = new Calculator_returntype();

        int sum = obj.addition(2, 1);
        System.out.println("Value of the addition is " + sum);

        int sub = obj.Subtraction(20, 10);
        System.out.println("Value of subtraction is " + sub);

        int Multi = obj.Multiple(2, 2);
        System.out.println("Value of multiple is " + Multi);

        int divi = obj.division(10, 5);
        System.out.println("Value of division is " + divi);

    }

}




