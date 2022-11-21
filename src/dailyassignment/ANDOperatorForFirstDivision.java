package dailyassignment;

public class ANDOperatorForFirstDivision {

    public static void main(String[] args) {

        /**  Write a Program to check marks and section of student
         * conditions are :
         1) marks should be greater than 60 (marks>60) for first division,
         and the section should be in SCIENCE and print passed with marks and section
         **/

        //TRUE & TRUE= TRUE (1X1=1)
        //TRUE & FALSE=FALSE(1X0=0)
        //FALSE & TRUE =FALSE(0X1=0)
        // FALSE & FALSE= FALSE(0X0=0)

        int marks = 75;
        String section = "SCIENCE";
        //TRUE & TRUE= TRUE (1X1=1)

        if(marks>60 & section =="SCIENCE"){

            System.out.println("Passed marks - FIRST DIVISION and Section-SCIENCE....TRUE & TRUE= TRUE (1X1=1)");

        }
         else{

         System.out.println("Not first division.....");
        }

        //TRUE & FALSE=FALSE(1X0=0)
        // reuse variable---- section

        section = "ART";

        if(marks>60 & section =="SCIENCE"){

            System.out.println("Passed marks - FIRST DIVISION and Section-SCIENCE....");

        }
        else{

            System.out.println("Not first division.....TRUE & FALSE=FALSE(1X0=0)");
        }


        //FALSE & TRUE =FALSE(0X1=0)
        // reuse variable-----marks,section
        marks = 55;
        section = "SCIENCE";

        if(marks>60 & section =="SCIENCE"){

            System.out.println("Passed marks - FIRST DIVISION and Section-SCIENCE....");

        }
        else{

            System.out.println("Not first division.....FALSE & TRUE =FALSE(0X1=0)");
        }


        // FALSE & FALSE= FALSE(0X0=0)
        // reuse variable-----section

        section ="TECH";
        if(marks>60 & section =="SCIENCE"){

            System.out.println("Passed marks - FIRST DIVISION and Section-SCIENCE....");

        }
        else{

            System.out.println("Not first division.....FALSE & FALSE= FALSE(0X0=0)");
        }



    }


}
