package methods;

public class MethodReturnType {

    public String welcome(String name) {
        String str = "Welcome to java programming " + name;
        return str;
    }

    public int makeSquare(int number) {
        int square = number*number;
        return square;
    }

    public boolean vote (int age, String city) {
        return age > 18 && city == "AGRA";
    }


    public static void main(String[] args) {
        MethodReturnType obj = new MethodReturnType();


       // result type 1
        String output = obj.welcome("Vineet");
        System.out.println(output);


       // result type 2
        int square = obj.makeSquare(5);
        System.out.println("Square of 5 is "+square);


       // result type 3
        boolean result = obj.vote(18 , "AGRA");
        System.out.println("Eligible for vote :"+result);
    }

}
