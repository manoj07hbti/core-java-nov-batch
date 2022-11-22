package conditional_statement;

public class Nested_if_marks {

    public static void main(String[] args) {

        // first division
        int marks = 30;
        if (marks > 60) {
            System.out.println("this is first division......");
        }

        // second division

        if (marks < 60) {
            if (marks > 48) {
                System.out.println("this is second division....");
            }
        }

        if (marks < 48) {

            if (marks >= 33) {
                System.out.println("this is third division");
            } else {
                System.out.println("this is failed......");

            }

        }
    }
}
