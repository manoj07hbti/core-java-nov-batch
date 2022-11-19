package conditional_statements;

public class Assignements {

    public static void main(String[] args) {

        int marks=30;

        // FIRST VISION
        if(marks>60){

            System.out.println("FIRST DIVISION ");
        }

       // SECOND DIVISION
        if(marks<60){

            if(marks>48){

                System.out.println("SECOND DIVISION ");
            }

        }

        //THIRD DIVISION

        if(marks<48){

            if(marks>=33){

                System.out.println("THIRD DIVISION");
            }
            else {
               System.out.println("FAILED ");
            }
        }



    }
}
