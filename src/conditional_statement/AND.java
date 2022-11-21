package conditional_statement;

public class AND {
    public static void main(String[] args) {

        int marks=62;
        String section="science";
        System.out.println("Conditions for First Division______");
        //FOR FIRST DIVISION
        //TRUE & TRUE= TRUE (1X1=1)

        if (marks>60 & section=="science"){
            System.out.println("Condition 1(TRUE & TRUE= TRUE (1X1=1)) = "+
                    "First division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("fail");
        }

        //TRUE & FALSE=FALSE(1X0=0)
        marks=62;
        section="arts";
        if (marks>60 & section=="science"){
            System.out.println("Condition 2 = "+"First division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 2 (TRUE & FALSE=FALSE(1X0=0)) = "+"FALSE STATEMENT");
        }
        //FALSE& TRUE =FALSE(0X1=0)
        marks=59;
        section="science";
        if (marks>60 & section=="science"){
            System.out.println("Condition 3 = "+"First division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 3 (FALSE& TRUE =FALSE(0X1=0)) = "+"FALSE STATEMENT");
        }
        //FALSE & FALSE= FALSE(0X0=0)
        marks=59;
        section="arts";
        if (marks>60 & section=="science"){
            System.out.println("Condition 4 = "+"First division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 4 (FALSE & FALSE= FALSE(0X0=0)) = "+"FALSE STATEMENT"+"\n");
        }

        //For second Division
        System.out.println("Conditions For Second Division______");

        marks=55;
        section="science";

        //TRUE & TRUE= TRUE (1X1=1)

        if (marks>48 & marks<60 & section=="science"){
            System.out.println("Condition 1(TRUE & TRUE= TRUE (1X1=1)) = "+
                    "Second division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("fail");
        }
        //TRUE & FALSE=FALSE(1X0=0)
        marks=56;
        section="arts";
        if (marks>48 & marks<60 & section=="science"){
            System.out.println("Condition 2 = "+"Second division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 2 (TRUE & FALSE=FALSE(1X0=0)) = "+"FALSE STATEMENT");
        }
        //FALSE& TRUE =FALSE(0X1=0)
        marks=33;
        section="science";
        if (marks>48 & marks<60 & section=="science"){
            System.out.println("Condition 3 = "+"Second division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 3 (FALSE& TRUE =FALSE(0X1=0)) = "+"FALSE STATEMENT");
        }
        //FALSE & FALSE= FALSE(0X0=0)
        marks=30;
        section="arts";
        if (marks>48 & marks<60 & section=="science"){
            System.out.println("Condition 4 = "+"Second division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 4 (FALSE & FALSE= FALSE(0X0=0)) = "+"FALSE STATEMENT"+"\n");
        }

        //For Third Division
        System.out.println("Conditions For Third Division______");

        marks=40;
        section="science";

        //TRUE & TRUE= TRUE (1X1=1)

        if (marks>=33 & marks<48 & section=="science"){
            System.out.println("Condition 1(TRUE & TRUE= TRUE (1X1=1)) = "+
                    "Third division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("fail");
        }
        //TRUE & FALSE=FALSE(1X0=0)
        marks=40;
        section="arts";
        if (marks>=33 & marks<48 & section=="science"){
            System.out.println("Condition 2 = "+"Third division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 2 (TRUE & FALSE=FALSE(1X0=0)) = "+"FALSE STATEMENT");
        }
        //FALSE& TRUE =FALSE(0X1=0)
        marks=29;
        section="science";
        if (marks>=33 & marks<48 & section=="science"){
            System.out.println("Condition 3 = "+"Third division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 3 (FALSE& TRUE =FALSE(0X1=0)) = "+"FALSE STATEMENT");
        }
        //FALSE & FALSE= FALSE(0X0=0)
        marks=30;
        section="arts";
        if (marks>=33 & marks<48 & section=="science"){
            System.out.println("Condition 4 = "+"Second division "+"\n"+"Section = "+ section );
        }else {
            System.out.println("Condition 4 (FALSE & FALSE= FALSE(0X0=0)) = "+"FALSE STATEMENT");
        }
    }
}
