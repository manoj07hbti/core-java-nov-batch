package Conditional_Statement;

public class RevisionORop {

    public static void main(String[] args) {

        int age = 21;
        String city="Delhi";

        // TRUE || TRUE = TRUE (1+1 = 1)
        if(age>18 || city=="Delhi") {
            System.out.println("Eligible for voting in Delhi.");
        }
        else{
            System.out.println("Not eligible for voting in Delhi.");
        }

        // TRUE || FALSE = TRUE (1+0 = 1)
        if(age>18 || city!="Delhi") {
            System.out.println("Eligible for voting in Delhi.");
        }
        else{
            System.out.println("Not eligible for voting in Delhi.");
        }

        // FALSE || TRUE = TRUE (0+1 = 1)
        if(age<18 || city=="Delhi") {
            System.out.println("Eligible for voting in Delhi.");
        }
        else{
            System.out.println("Not eligible for voting in Delhi.");
        }

        // FALSE || FALSE = FALSE (0+0 = 0)
        if(age<18 || city!="Delhi") {
            System.out.println("Eligible for voting in Delhi.");
        }
        else{
            System.out.println("Not eligible for voting Delhi.");
        }
    }
}
