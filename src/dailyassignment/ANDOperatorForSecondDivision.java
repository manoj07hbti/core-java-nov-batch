package dailyassignment;

public class ANDOperatorForSecondDivision {

    public static void main(String[] args) {

        /**  Write a Program to check marks and section of student
         * conditions are :
         2) marks should be greater than 48 but less than 60 (60<marks>48) for second division,
         and the section should be in SCIENCE and print passed with marks and section
         **/

        //TRUE & TRUE= TRUE (1X1=1)
        //TRUE & FALSE=FALSE(1X0=0)
        //FALSE & TRUE =FALSE(0X1=0)
        // FALSE & FALSE= FALSE(0X0=0)

        int marks = 55;
        String section = "SCIENCE";

        //TRUE & TRUE= TRUE (1X1=1)
        if(marks<60){

            System.out.println("Marks are less than 60... code of this block will execute and after this it will check inside if condition..");
            if(marks>48 & section =="SCIENCE"){


                System.out.println("Passed marks-SECOND DIVISION and Section-SCIENCE....TRUE & TRUE= TRUE (1X1=1).");

            }
            else{

                System.out.println("Not second division....");

            }


        }



        //TRUE & FALSE=FALSE(1X0=0)
        // reuse variable---- section

          section ="ART";

         if(marks<60){

            System.out.println("Marks are less than 60... code of this block will execute and after this it will check inside if condition..");
            if(marks>48 & section =="SCIENCE"){


                System.out.println("Passed marks-SECOND DIVISION and Section-SCIENCE....");

            }
            else{

                System.out.println("Not second division and not section-SCIENCE.....TRUE & FALSE=FALSE(1X0=0).");

            }


        }




        //FALSE & TRUE =FALSE(0X1=0)
        // reuse variable----marks, section
         marks= 40;
         section ="SCIENCE";

        if(marks<60){

            System.out.println("Marks are less than 60... code of this block will execute and after this it will check inside if condition..");
            if(marks>48 & section =="SCIENCE"){


                System.out.println("Passed marks-SECOND DIVISION and Section-SCIENCE....");

            }
            else{

                System.out.println("Not second division and not section-SCIENCE.....FALSE & TRUE =FALSE(0X1=0)");

            }


        }


        // FALSE & FALSE= FALSE(0X0=0)
        // reuse variable---- section
        section ="ART";


        if(marks<60){

            System.out.println("Marks are less than 60... code of this block will execute and after this it will check inside if condition..");
            if(marks>48 & section =="SCIENCE"){


                System.out.println("Passed marks-SECOND DIVISION and Section-SCIENCE....");

            }
            else{

                System.out.println("Not second division and not section-SCIENCE.....FALSE & FALSE= FALSE(0X0=0)");

            }


        }







    }






}
