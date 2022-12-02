package methods;

public class MethodInputParam {

    //SYNTAX: access_specifier return_type  method_name (Datatype varName1,Datatype varName2...Datatype varNameN) {CODE..}

    public void hello(String name){

        System.out.println("Hello , Welcome to Java programming "+name);
    }


    public void makeCube(int number){

        int cube= number*number*number;

        System.out.println("Cube of number is "+cube);
    }

    public void vote( int age, String city){

        if(age>18 && city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA");
        }
        else {
            System.out.println("Person is NOT eligible for voting in AGRA");
        }
    }



    public static void main(String[] args) {
        MethodInputParam obj= new MethodInputParam();
        obj.hello("Rahul");
        obj.hello("Rakesh");

        obj.makeCube(3);
        obj.makeCube(7);
        obj.makeCube(2);

        obj.vote(12,"AGRA");
        obj.vote(19,"AGRA");
        obj.vote(19,"DELHI");
    }
}
