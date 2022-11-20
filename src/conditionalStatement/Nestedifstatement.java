package conditionalStatement;

public class Nestedifstatement {

    public static void main(String[] args) {

        int marks = 70;
        if (marks > 60) {
            System.out.println("you pass the exam with first division");

        }
        if (marks < 60) {
            if (marks > 50) {
                System.out.println("you pass the exam with second division");
            }
        }
        if (marks < 50) {
            if (marks > 33) {
                System.out.println("you pass the exam with third division");

            }
        else{
                    System.out.println("you have failed in the exam");
                }

        }
    }
}

