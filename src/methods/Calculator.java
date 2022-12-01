package methods;

public class Calculator {

    // ADD, SUB, MULTI, DIV

    // ADD
    public void Addition() {

        int a = 23;
        int b = 54;

        int result = a + b;
        System.out.println("Sum is : "+result);

    }


    // SUB
    public void Subtraction(){

        int a= 76, b =43;

        int result =a-b;
        System.out.println("Sub is : "+result);
    }


    // MULTIPLY

    public void Multiply(){

        int a= 7, b =3;

        int result =a*b;
        System.out.println("Multiply is : "+result);
    }


    // DIVIDE
    public void Divide(){

        int a= 7, b =3;

        double result =(double)a/b;
        System.out.println("Div is : "+result);
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.Addition();
        obj.Subtraction();
        obj.Multiply();
        obj.Divide();

    }
}
