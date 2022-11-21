package conditional_statements;

public class ANDOperator {

    public static void main(String[] args) {

        int age=19;
        String city="AGRA";

        //TRUE & TRUE= TRUE (1X1=1)

        if( age>18 & city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA ..TRUE & TRUE= TRUE (1X1=1)");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA..");
        }

        //TRUE & FALSE=FALSE(1X0=0)

        city="DELHI";

        if( age>18 & city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA ..");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA.. TRUE & FALSE=FALSE(1X0=0)");
        }

        //FALSE & TRUE =FALSE(0X1=0)
        age=17;
        city="AGRA";

        if( age>18 & city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA ..");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA..  FALSE & TRUE =FALSE(0X1=0)");
        }

        //  FALSE & FALSE= FALSE(0X0=0)
        age=17;
        city="DELHI";

        if( age>18 & city=="AGRA" ){

            System.out.println("Eligible for voting in AGRA ..");
        }
        else {
            System.out.println("NOT Eligible for voting in AGRA.. FALSE & FALSE= FALSE(0X0=0)");
        }


    }
}
