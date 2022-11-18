package conditionalAssignment1;

public class StudentMarks {

    public static void main(String[] args) {

        int marks = 65;
        if (marks > 60) {
            System.out.println("Get First Division...");
        }
        if (marks < 60) {
            System.out.println("Get Second Division...");
        }

        int Marks = 55;
        if (Marks > 50) {
            System.out.println("Get Second Division...");
        }
        if (Marks < 48) {
            System.out.println("Get Third Division...");
        }

        int Mark = 45;
        if (Mark > 40) {
            System.out.println("Get Third Division....");
        }
        if (Mark < 39) {
            System.out.println("You are Fail...");
        }

    }
}
