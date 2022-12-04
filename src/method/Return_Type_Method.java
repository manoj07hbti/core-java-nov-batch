package method;

public class Return_Type_Method {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public String welcome(String name){

        String str="Welcome to java Programing with return type method..... "+name;

        return str;
    }

    public int makeSquare(int number){

        int square=number*number;

        return square;

    }

    public boolean vote(int age, String city){

        if(age>18 && city==" Pune ") {

            return true;

        }
        else {

            return false;

        }

    }


    public static void main(String[] args) {


        Return_Type_Method obj= new Return_Type_Method ();
        String output= obj.welcome(" Haider Ali Abbas ");

        System.out.println(output);

        int square= obj.makeSquare(6);

        System.out.println("The square is :"+square);

        boolean result=  obj.vote(18,"Pune");

        System.out.println("yes I can do it : "+result);

    }

}

