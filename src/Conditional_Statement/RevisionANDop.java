package Conditional_Statement;

public class RevisionANDop {

    public static void main(String[] args) {

        int age = 19;
        String city = "AGRA";

        // TRUE & TRUE = TRUE (1*1 = 1)
        if(age>18 & city=="AGRA") {
            System.out.println("Eligible for voting in agra.");
        }
        else{
            System.out.println("Not eligible for voting in agra.");
        }

        // TRUE & FALSE = FALSE (1*0 = 0)
        if(age>18 & city!="AGRA"){
            System.out.println("Eligible for voting in AGRA.");
        }
        else{
            System.out.println("Not eligible for voting in AGRA.");
        }

        // False & TRUE = FALSE (0*1 = 0)
        if(age<18 & city=="AGRA") {
            System.out.println("Eligible for voting in AGRA.");
        }
        else{
            System.out.println("Not eligible for voting in AGRA.");
        }

        // FALSE & FALSE = FALSE (0*0 = 0)
        if(age<18 & city!="AGRA") {
            System.out.println("Eligible for voting in AGRA.");
        }
        else{
            System.out.println("Not eligible for voting in AGRA.");
        }
    }
}
