package conditional_statement;

public class Conditional_If {

    public static void main (String [] args){

        //SYNTAX  :  if(condition expression){
        //               CODE
        //             }

        int age=17;
        if ( age>18 ){
            System.out.println("eligible for voting");

        }
        if ( age<18){
            System.out.println("Not eligible for voting");

        }

        String city = "Delhi";
        if ( city=="Agra"){
            System.out.println("you belongs to Agra");

        }
        if (city != "agra"){
            System.out.println("you belongs to other city");
        }
    }
}
