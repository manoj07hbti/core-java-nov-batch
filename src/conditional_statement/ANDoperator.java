package conditional_statement;

import java.util.Scanner;

public class ANDoperator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String section="science";
        String section2="arts";




        if (marks>60 & section=="science"){
            System.out.println("Division = "+"first"+"\n"+"Section = " + section);
        }


        if (marks>=48 & marks<60 & section=="science"){
            System.out.println("Division = "+"second"+"\n"+"Section = " + section);
        }


        if (marks>=33 & marks<48 & section=="science"){
            System.out.println("Division = "+"third"+"\n"+"Section = " + section2);
        }
    }
}
