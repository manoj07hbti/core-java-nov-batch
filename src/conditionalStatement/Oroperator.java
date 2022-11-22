package conditionalStatement;

public class Oroperator {
    public static void main(String[] args) {
        //true&true=true
        int marks = 70;
        String section = "science";
    if (marks > 60 ||section == "science") {

            System.out.println("your marks is" + marks + "your section will be" + section);
        } else {
            System.out.println("your marks is" + marks + "your section will not be science");
        }
        //true&false=true
        section = "arts";
        if (marks > 60 || section == "science") {

            System.out.println("your marks is" + marks + "your section will be" + section);
        } else {
            System.out.println("your marks is" + marks + "your section will not be science");
        }
        //false&true=true
        marks = 47; section="science";

        if (marks > 60 || section == "science") {

            System.out.println("your marks is" + marks + "your section will be" + section);
        } else {
            System.out.println("your marks is" + marks + "your section will not be science");
        }
        //false&false=false
        section = "arts";
        marks = 43;
        if (marks > 60 || section == "science") {

            System.out.println("your marks is" + marks + "your section will be" + section);
        } else {
            System.out.println("n/a");
        }
        //second division
        //true&true=true
        marks = 57;
        section = "arts";
        if (marks < 60 ||marks > 48 || section == "arts") {
            System.out.println("your marks is " + marks + "your section will be" + section);
        } else {
            System.out.println("Not in data");
        }
        //false&true=true
        marks = 67;
        if (marks < 60 || marks > 48 || section == "arts") {
            System.out.println("your marks is " + marks + "your section will be" + section);
        } else {
            System.out.println("Not in data");
        }
        //true&false=true
        marks = 49;
        section = "science";
        if (marks < 60 || marks > 48 || section == "arts") {
            System.out.println("your marks is " + marks + "your section will be" + section);
        } else {
            System.out.println("your marks is" + marks + "your section is not found");
        }
        //false&false=false
        marks=77;
        section="hindi";
        if (marks < 60 || marks > 48 || section == "arts") {
            System.out.println("your marks is " + marks + "your section will be" + section);
        } else {
            System.out.println("you are not in list");
        }

        // Third division
        //true&true=true
        marks = 34;

        if (marks < 48 || marks >= 33 || section == "Homescience") {
            System.out.println("you pass the exam with 3 rd div" + marks + "your section is " + section);
        } else {
            System.out.println("you are a super star");
        }
        //false&true=true
        marks = 67;
        if (marks < 48 || marks >= 33 || section == "Homescience") {
            System.out.println("you pass the exam with 3 rd div" + marks + "your section is " + section);
        } else {
            System.out.println("your marks is good " + marks + "you cant take " + section);
        }
        //true&false=true
        marks = 36;
        section = "science";
        if (marks < 48 || marks >= 33 || section == "Homescience") {
            System.out.println("you pass the exam with 3 rd div" + marks + "your section is " + section);
        } else {
            System.out.println("your marks is  " + marks + "you cant take " + section);
        }
        //false&false=false
        marks = 74;
        section = "arts";
        if (marks < 48 || marks >= 33 || section == "Homescience") {
            System.out.println("you pass the exam with 3 rd div" + marks + "your section is " + section);
        } else {
            System.out.println("you are not in my data");
        }




}
}
