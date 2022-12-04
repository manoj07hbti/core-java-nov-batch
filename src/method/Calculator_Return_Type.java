package method;

public class Calculator_Return_Type {

    // Add Number
    public int Add(int a, int b) {

        int sum = a+b;
        return sum;
    }

    // Sub Number
    public int Sub(int a, int b) {

        int sub = a-b;
        return sub;
    }

    // Multi Number
    public int Multi(int a, int b) {

        int multi = a*b;
        return multi;
    }

    // Divide Number
    public int Div(int a, int b) {

        int div = a/b;
        return div;
    }

    public static void main(String[] args) {
        Calculator_Return_Type obj = new Calculator_Return_Type ();


        // Add return output
        int result = obj.Add(50, 25);
        System.out.println("The sum is : "+result);

        // Sub return output
        int Subs = obj.Sub(60, 30);
        System.out.println("The sub is :"+Subs);

        // Multi return output
        int multi = obj.Multi(15,10);
        System.out.println("The multiply is :"+multi);

        // Div return output
        int div = obj.Div(144, 12);
        System.out.println("The div is :"+div);
    }


}


