package methods;

public class Calculator3 {

    // ADDITION IN RETURN TYPE METHOD
    public int Add(int a, int b) {

        int sum = a+b;
        return sum;
    }

    // SUBTRACT IN RETURN TYPE METHOD
    public int Sub(int a, int b) {

        int sub = a-b;
        return sub;
    }

    // MULTIPLY IN RETURN TYPE METHOD
    public int Multi(int a, int b) {

        int multi = a*b;
        return multi;
    }

    // DIVIDE IN RETURN TYPE METHOD
    public int Div(int a, int b) {

        int div = a/b;
        return div;
    }

    public static void main(String[] args) {
        Calculator3 obj = new Calculator3();


        // Add return output
        int result = obj.Add(23, 56);
        System.out.println("sum is : "+result);

       // Sub return output
        int Subs = obj.Sub(345, 122);
        System.out.println("Sub is :"+Subs);

        // Multi return output
        int multi = obj.Multi(23,3);
        System.out.println("Multiply is :"+multi);

        // Div return output
        int div = obj.Div(56, 7);
        System.out.println("Div is :"+div);
    }


}
