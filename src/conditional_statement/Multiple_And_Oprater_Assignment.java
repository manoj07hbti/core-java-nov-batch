package conditional_statement;

public class Multiple_And_Oprater_Assignment {

    public static void main(String[] args) {

        // True & True = True (1X1=1)
        int marks = 50;
        String section ="Science";
        if (marks>60 & section=="Science" ){
            System.out.println(" Congratulation ! you passed with first division...");
        }
        else {
            System.out.println("i am sorry ! you are failed.................................");
        }

        // True & False = False ( 1X0=0)
        if (marks>48 & marks<60 & section=="Science"){
            System.out.println("Congratulation ! you passed with second division....");
        }
        else {
            System.out.println("i am sorry ! you are failed..........................");
        }

        // False & True = False (0X1=0)
        if (marks>=33 & marks<48 & section== "Science"){
            System.out.println("Congrtulation ! you passed with third division......");
        }
        else {
            System.out.println("i am sorry ! you are failed..........................");
        }

        // False & False = False (0X0=0)
        if (marks>30 & section=="Maths"){
            System.out.println("Congrtulation ! you passed.............");
        }
        else {
            System.out.println("i am sorry ! you are failed......");
        }


    }


}
