package method;

public class Input_Program {

    //SYNTAX: access_specifier return_type  method_name (Datatype varName1,Datatype varName2...Datatype varNameN) {CODE..}

    public void hello(String name){

        System.out.println("Hello , Welcome to Java programming "+ name);
    }


    public void makeCube(int number){

        int cube= number*number*number;

        System.out.println("The cube of number is "+cube);
    }

    public void vote( int age, String city){

        if(age>20 && city=="Pune"){

            System.out.println("I want to go Pune ........");
        }
        else {
            System.out.println("I don't want to go Pune......");
        }
    }



    public static void main(String[] args) {
        Input_Program obj= new Input_Program();
        obj.hello("Haider Ali Abbas");
        obj.hello("Sonu Kumar");

        obj.makeCube(12);
        obj.makeCube(15);
        obj.makeCube(13);

        obj.vote(30,"Pune ");
        obj.vote(25,"Delhi");
        obj.vote(18,"Agra");
    }
}


