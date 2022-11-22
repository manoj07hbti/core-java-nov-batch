package conditional_statments;

public class And_operator {
    public static void main(String[] args) {

        int age = 25;
        String city = "Agra";

        //True & true=True(1*1=1)

        if (age > 24 & city == " Agra") {
            System.out.println(" Eligible for voting in Agra...");
        } else {
            System.out.println("Not Eligible for voting in  Agra....");

        }
        // True  and false(1*0)=0
        city = "Kanpur";
        if (age > 24 & city == "Agra") {
            System.out.println(" Eligible for voting");
        } else {
            System.out.println("Not eligible for voting in Agra");

        }
        //  False & true
        age = 25;
        city = "Agra";
        if (age > 24 & city == "Agra") {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not Eligible for voting in  Agra ....");
        }

        //False & false
        age = 27;
        city = "Dehradun";
        if (age > 30 & city == "Delhi") {

            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }


    }
    }


