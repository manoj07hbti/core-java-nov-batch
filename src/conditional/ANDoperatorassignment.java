package conditional;

public class ANDoperatorassignment {
    public static void main(String[] args) {
        int marks = 85;
        String section = "a";
        if (marks > 60 & section == "a") {
            System.out.println("first division");
        }
        if (marks < 60 & marks > 48 & section == "a") {
            System.out.printf("second division");
        }
        if (marks < 48 & marks >= 33 & section == "a") {
            System.out.printf("third division");
        }
        marks=9;
        section="b";
        if (marks > 60 & section == "a") {
            System.out.println("first division");
        }
        if (marks < 60 & marks > 48 & section == "a") {
            System.out.printf("second division");
        }
        if (marks < 48 & marks >= 33 & section == "a") {
            System.out.printf("third division");
        }else{
            System.out.println("fail");
        }
        }

    }
