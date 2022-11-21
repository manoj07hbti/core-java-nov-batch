package dailyassignment;

public class ANDOperatorForThirdDivision {

    public static void main(String[] args) {

        /**  Write a Program to check marks and section of student
         * conditions are :
         3) marks should be greater than and equal 33 but less than 48 (48<marks>=33) for third division
         and the section should be in SCIENCE and print passed with marks and section
         **/

        //TRUE & TRUE= TRUE (1X1=1)
        //TRUE & FALSE=FALSE(1X0=0)
        //FALSE & TRUE =FALSE(0X1=0)
        // FALSE & FALSE= FALSE(0X0=0)


        //TRUE & TRUE= TRUE (1X1=1)

        int marks = 37;
        String section = "SCIENCE";

        if(marks<48){

            System.out.println("Marks are less than 48... code of this block will execute and after this it will check inside if condition..");

            if (marks>=33 & section =="SCIENCE"){

                System.out.println("Passed marks-THIRD DIVISION and Section-SCIENCE....TRUE & TRUE= TRUE (1X1=1)");
            }

            else{

                System.out.println("Not second division and not section-SCIENCE......");

            }


        }


        //TRUE & FALSE=FALSE(1X0=0)
        // reuse variable---- section

        section ="ART";

        if(marks<48){

            System.out.println("Marks are less than 48... code of this block will execute and after this it will check inside if condition..");

            if (marks>=33 & section =="SCIENCE"){

                System.out.println("Passed marks-THIRD DIVISION and Section-SCIENCE....");
            }

            else{

                System.out.println("Not second division and not section-SCIENCE.....TRUE & FALSE=FALSE(1X0=0)");

            }


        }


        //FALSE & TRUE =FALSE(0X1=0)
        // reuse variable---- marks ,section
        marks = 30;
        section ="SCIENCE";


        if(marks<48){

            System.out.println("Marks are less than 48... code of this block will execute and after this it will check inside if condition..");

            if (marks>=33 & section =="SCIENCE"){

                System.out.println("Passed marks-THIRD DIVISION and Section-SCIENCE....");
            }

            else{

                System.out.println("Not second division and not section-SCIENCE.....FALSE & TRUE =FALSE(0X1=0)");

            }


        }

        // FALSE & FALSE= FALSE(0X0=0)
        // reuse variable---- section
         section ="ART";

        if(marks<48){

            System.out.println("Marks are less than 48... code of this block will execute and after this it will check inside if condition..");

            if (marks>=33 & section =="SCIENCE"){

                System.out.println("Passed marks-THIRD DIVISION and Section-SCIENCE....");
            }

            else{

                System.out.println("Not second division and not section-SCIENCE.....FALSE & FALSE= FALSE(0X0=0)");

            }


        }










    }



}
