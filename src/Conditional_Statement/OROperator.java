package Conditional_Statement;

public class OROperator {

    public static void main(String[] args) {

        int age = 19;
        String city = "AGRA";

        // TRUE || TRUE = TRUE (1+1=1)

        if (age > 18 || city =="AGRA") {
            System.out.println("Eligible for voting in AGRA... TRUE || TRUE = TRUE (1+1=1)");
        }
        else{
            System.out.println("Not Eligible for voting in AGRA");
        }

        // TRUE || FALSE = TRUE (1+0 =0)

        city = "DELHI";
        if (age > 18 || city =="AGRA") {
            System.out.println("Eligible for voting in AGRA... TRUE || FALSE = TRUE (1+0 =0)");
        }
        else{
            System.out.println("Not Eligible for voting in AGRA");
        }

        // FALSE || TRUE = FALSE (0+1=0)

        age = 15;
        city = "AGRA";
        if (age > 18 || city =="AGRA") {
            System.out.println("Eligible for voting in AGRA... FALSE || TRUE = FALSE (0+1=0)");
        }
        else{
            System.out.println("Not Eligible for voting Iin AGRA");
        }
        // FALSE || FALSE = FALSE (0+0 = 0)

        age = 14; city = "DELHI";

        if (age > 18 || city =="AGRA") {
            System.out.println("Eligible for voting in AGRA... FALSE || FALSE = FALSE (0+0 = 0)");
        }
        else{
            System.out.println("Not Eligible for voting in AGRA... FALSE || FALSE = FALSE (0+0 = 0)");
        }

    }

}
