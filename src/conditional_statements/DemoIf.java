package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {

        //SYNTAX  :  if(condition expression){
        //               CODE
        //             }

        int age=17;

        if( age>18 ) {

            System.out.println("Eligible for Voting ....");
        }

        if ( age<18 ){

            System.out.println("NOT Eligible for voting ....");
        }

        String city="DELHI";

        if(city == "AGRA"){

            System.out.println("You Belongs to AGRA .....");
        }

        if(city != "AGRA"){

            System.out.println("Person belongs to some other city...");
        }


    }
}
