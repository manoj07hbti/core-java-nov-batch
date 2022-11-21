package Conditional_Statement;

public class ANDOperator {

    public static void main(String[] args) {

        int age = 19;
        String city = "AGRA";

        // TRUE & TRUE = TRUE (1*1 = 1)

        if (age > 18 & city=="AGRA") {
            System.out.println("Eligible for voting in AGRA...");
        }
        else {
            System.out.println("Not Eligible for voting in AGRA...");

        }

        // TRUE & FALSE = FALSE (1*0 = 0)

        city = "DELHI";

        if (age > 18 & city=="AGRA") {
            System.out.println("Eligible for voting in AGRA...");
        }
        else {
            System.out.println("Not Eligible for voting in AGRA...");

        }

        // FALSE & TRUE = FALSE (0*1 = 0)

         age = 16;

        if (age > 18 & city=="AGRA") {
            System.out.println("Eligible for voting in AGRA...");
        }
        else {
            System.out.println("Not Eligible for voting in AGRA...");

        }

        // FALSE & FALSE = FALSE (0*0= 0)

        age = 16;   city = "DELHI";
        if (age > 18 & city=="AGRA") {
            System.out.println("Eligible for voting in AGRA...");
        }
        else {
            System.out.println("Not Eligible for voting in AGRA...");

        }

    }
}
