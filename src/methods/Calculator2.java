package methods;

public class Calculator2 {

    // ADD, SUB,  MULTI, DIV

   //ADD
    public void Addition(int a, int b) {

        int result = a + b;
        System.out.println("Sum is ="+result);
    }

    // SUB
    public void Subtract(int a, int b) {

        int result = a - b;
        System.out.println("Sub is ="+result);
    }

    // MULTIPLY
    public void Multiply(int a, int b) {

        int result = a * b;
        System.out.println("Multi is ="+result);
    }

    //DIVIDE
    public void Divide(int a, int b) {

        int result = a / b;
        System.out.println("Div is ="+result);
    }

    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();

        obj.Addition(3,6);
        obj.Addition(43, 5);
        obj.Addition(233, 423);

        obj.Subtract(32, 20);
        obj.Subtract(12, 8);
        obj.Subtract(456, 123);

        obj.Multiply(23, 3);
        obj.Multiply(12, 10);
        obj.Multiply(15, 8);

        obj.Divide(12, 4);
        obj.Divide(50, 2);
        obj.Divide(24, 4);
    }
}
