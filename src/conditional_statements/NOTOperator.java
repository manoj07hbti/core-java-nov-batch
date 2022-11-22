package conditional_statements;

public class NOTOperator {

    public static void main(String[] args) {

        int age=19;

        if( !(age<18) ){

            System.out.println("Eligible for voting ");
        }
        else {

            System.out.println("NOT Eligible for voting ....");
        }

        if(age != 0){

            System.out.println("Age is not zero ");
        }


        String city="AGRA";

        if( !(city!="AGRA") ){

            System.out.println("City is Agra");
        }
        else {

            System.out.println("CIty is not Agra....");
        }


    }
}
