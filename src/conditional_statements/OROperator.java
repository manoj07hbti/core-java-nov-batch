package conditional_statements;

public class OROperator {

    public static void main(String[] args) {

        int age=19;
        String city="AGRA";

      // TRUE||TRUE= TRUE (1+1=1)

        if( age>18 || city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA ..TRUE || TRUE= TRUE (1X1=1)");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA..");
        }

       //TRUE || FALSE =TRUE (1+0=1)
        city="DLEHI";

        if( age>18 || city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA .. TRUE || FALSE =TRUE (1+0=1");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA..");
        }

        // FALSE||TRUE=TRUE (0+1=1)

        age=10;
        city="AGRA";

        if( age>18 || city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA .. FALSE||TRUE=TRUE (0+1=1)");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA..");
        }

        //FALSE || FALSE= FALSE(0+0=0)
        age=17;
        city="DELHI";

        if( age>18 || city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA .. ");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA.. FALSE || FALSE= FALSE(0+0=0)");
        }

    }
}
