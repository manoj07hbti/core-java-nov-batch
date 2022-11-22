package conditionalAssignment1;

public class ANDOperatorAssignment {

    /*if (condition1 operator condition2)
   AND -->  &  :
                   TRUE & TRUE= TRUE (1X1=1)
                   TRUE & FALSE=FALSE(1X0=0)
                   FALSE & TRUE =FALSE(0X1=0)
                   FALSE & FALSE= FALSE(0X0=0)
   Write a Program to check marks and section of student : marks should be greater than 33 and section should be in
   ( SCIENCE) and print passed with marks and section
    */
    public static void main(String[] args) {

        // FIRST DIVISION ALL SCENARIO

        int marks = 65;
        String section = "SCIENCE";
        //Code of CONDITION-1  -  TRUE & TRUE= TRUE (1X1=1)

        if (marks > 60  & section =="SCIENCE") {
         System.out.println("You are passed SCIENCE section with FIRST DIVISION.... TRUE & TRUE= TRUE (1X1=1)");
       }
        else{
         System.out.println("you passed with second division...");
       }

        //Code of CONDITION-2  -  TRUE & FALSE= FALSE (1X0=0)
        marks = 50;
       section = "ARTS";

       if(marks>48  & section =="ARTS") {
           System.out.println("You are passed ARTS section with SECOND division... TRUE & FALSE= FALSE (1X0=0)");
       }
       else{
           System.out.println("you passed with third division...");
       }

       //Code of CONDITION-3 -  FALSE & TRUE = FALSE (0*1=0)
      section = "SCIENCE";
       marks = 40;

       if(marks>33 & section == "SCIENCE") {
           System.out.println("You are passed ARTS section with THIRD DIVISION... FALSE & TRUE = FALSE (0*1=0)");
       }
       else{
           System.out.println("You are failed...");
       }

       //Code of CONDITION-4  - FALSE & FALSE= FALSE (0*0=0)
        marks = 30;
       section = "ARTS";

       if(marks>30 & section =="SCIENCE") {
           System.out.println("You are passed...");
       }
       else{
           System.out.println("You are failed... FALSE & FALSE= FALSE (0*0=0)");
       }

    }
}