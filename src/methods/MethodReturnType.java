package methods;

public class MethodReturnType {
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public String welcome(String name){

        String str="Welcome to java Programing with return type : "+name;

        return str;
    }

    public int makeSquare(int number){

        int square=number*number;

        return square;

    }

    public boolean vote(int age, String city){

        if(age>18 && city=="AGRA"){

            return true;

        }
        else {

            return false;

        }

    }


    public static void main(String[] args) {


        MethodReturnType obj= new MethodReturnType();
        String output= obj.welcome("Raj");

        System.out.println(output);

        int square= obj.makeSquare(9);

        System.out.println("Square is :"+square);

        boolean result=  obj.vote(17,"AGRA");

        System.out.println("Person is Eligible : "+result);

    }

}
