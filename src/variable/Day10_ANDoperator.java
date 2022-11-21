package variable;

public class Day10_ANDoperator {
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

        int marks = 70;
        String section = "science";
                                           //Code of  -  TRUE & TRUE= TRUE (1X1=1)
        if (marks>60 & section=="science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
                                          //Code of  -  TRUE & FALSE=FALSE(1X0=0)
        section ="arts";
        if (marks>60 & section=="science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("You Passed with " +marks+ "% marks & Section is N/A");
        }
                                            //Code of  -  FALSE & TRUE =FALSE(0X1=0)
        marks = 55; section = "science";
        if (marks>60 & section=="science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("Your marks are N/A & your section is " +section);
        }
                                            //Code of  -  FALSE & FALSE =FALSE(0X0=0)

        section = "arts";
        if (marks>60 & section=="science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("Data Not Found........");
        }
                                                        // SECOND DIVISION ALL SCENARIO
                                                        //Code of  -  TRUE & TRUE= TRUE (1X1=1)
        section = "science"; // marks value is 55 in code line 31
        if(marks<60 & marks>48 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
                                                        //Code of  -  TRUE & FALSE=FALSE(1X0=0)
        section="arts";
        if(marks<60 & marks>48 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("You Passed with " +marks+ "% marks & Section is N/A");
        }
                                                       //Code of  -  FALSE & TRUE=FALSE(0X1=0)
        marks=33; section = "science";
        if(marks<60 & marks>48 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("Your marks are N/A & your section is " +section);
        }
                                                        //Code of  -  FALSE & FALSE =FALSE(0X0=0)

        section = "arts";
        if (marks<60 & marks>48 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("Data Not Found........");
        }
                                                        // THIRD DIVISION ALL SCENARIO
                                                        //Code of  -  TRUE & TRUE= TRUE (1X1=1)
        section = "science"; // marks value is 33 in code line 62
        if(marks<48 & marks>=33 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        //Code of  -  TRUE & FALSE=FALSE(1X0=0)
        section="arts";
        if(marks<48 & marks>=33 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("You Passed with " +marks+ "% marks & Section is N/A");
        }
        //Code of  -  FALSE & TRUE=FALSE(0X1=0)
        marks=30; section = "science";
        if(marks<48 & marks>=33 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("You are failed & your section is " +section);
        }
        //Code of  -  FALSE & FALSE =FALSE(0X0=0)

        section = "arts";
        if (marks<48 & marks>=33 & section == "science"){
            System.out.println("You Passed with " +marks+ "% marks & Section is " +section);
        }
        else {
            System.out.println("Data Not Found........");
        }




    }

}
