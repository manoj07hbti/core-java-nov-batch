package dailyassignment;

public class ConditionalStatementMultiConditionsANDOp {

    public static void main(String[] args) {

     /**  Write a Program to check marks and section of student
      * conditions are :
     1) marks should be greater than 60 (marks>60) for first division,
     2) marks should be greater than 48 but less than 60 (60<marks>48) for second division,
     3) marks should be greater than and equal 33 but less than 48 (48<marks>=33) for third division
      and the section should be in SCIENCE and print passed with marks and section
        **/



        // 1) marks should be greater than 60 (marks>60) for first division
        //and the section should be in SCIENCE and print passed with marks and section
        // first we will take variables------marks, section and applied if statement and,AND operator(&)
        // TRUE & TRUE= TRUE (1X1=1)

         int marks = 75;
         String section = "SCIENCE";


         if(marks>60 & section =="SCIENCE"){

           System.out.println("Here both conditions are true so output is true....Passed marks - FIRST DIVISION and Section-SCIENCE....");

         }


         // 2) marks should be greater than 48 but less than 60 (60<marks>48) for second division
        //and the section should be in SCIENCE and print passed with marks and section
        // reuse variable-----marks
        //TRUE & TRUE= TRUE (1X1=1)
         marks = 55;

         // applied Nested if statement: if(condition){code to be executed if(condition){code to be executed}} and ,AND Operator(&)
         if(marks<60){

             System.out.println("Marks are less than 60... code of this block will execute and after this it will check inside if condition..");
             if(marks>48 & section =="SCIENCE"){


                System.out.println("Here both conditions are true so output is true----Passed marks-SECOND DIVISION and Section-SCIENCE.....");

                 }


            }



         // 3) marks should be greater than and equal 33 but less than 48 (48<marks>=33) for third division
        // and the section should be in SCIENCE and print passed with marks and section
        // reuse variable-----marks
        //TRUE & TRUE= TRUE (1X1=1)
        marks = 37;
        // applied Nested if statement: if(condition){code to be executed if(condition){code to be executed}} and ,AND Operator(&)

        if(marks<48){

         System.out.println("Marks are less than 48... code of this block will execute and after this it will check inside if condition..");

            if (marks>=33 & section =="SCIENCE"){

                System.out.println("Here both conditions are true so output is true----Passed marks-THIRD DIVISION and Section-SCIENCE..");
            }


        }







         }



       }
