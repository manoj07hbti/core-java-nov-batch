package variable;

public class Day8Assignment_if {

    /*  Conditional Statement Syntax
            if (Condition){
                Write the code
                }
        Condition If marks  >60   first division
                            >50   second
                            >33   third

         */

    public static void main(String[] args) {
        int marks = 32;
        if (marks > 60) {
            System.out.println("First Division");
        }
        //for second division
        if (marks < 60) {
            if (marks > 48) {
                System.out.println("Second Division");
            }
        }
        // for third division

        if (marks<48){
            if (marks>=33){
                System.out.println("Third Division");
            }
            else{
                System.out.println("Failed");
            }
        }

        }

    }


