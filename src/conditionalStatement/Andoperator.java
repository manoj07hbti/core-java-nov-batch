package conditionalStatement;

public class Andoperator {
    public static void main(String[] arg) {

        int marks = 73;
        String section = "science";

        if (marks > 60 & section == "science") {
            System.out.println("you pass the exam with 1 st division" + marks + "%  you qualify for " + section);
        }


            section = "arts";
            if (marks < 60 & marks > 48 & section == "arts") {
                System.out.println("you pass the exam with 2 nd division" + marks + "%  you qualify for" + section);
            }


                section = "homescience";

                if (marks < 48 & marks >= 33 & section == "homescience") {
                    System.out.println("you pass the exam with 3 rd division" + marks + "%  you qualify for " + section);
                }

                if (marks < 33) {
                    System.out.println("you failed in exam" + marks);
                }
                else{
                    System.out.println("you enter the wrong data");
                }



    }
}
