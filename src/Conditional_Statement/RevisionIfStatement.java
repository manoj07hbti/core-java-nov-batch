package Conditional_Statement;

public class RevisionIfStatement {

    public static void main(String[] args) {
        // if(condition){
        // code
        // }

        int age = 17;

        if( age>18) {
            System.out.println("Eligible for voting.");
        }

        if(age<18){
            System.out.println("Not eligible for voting.");
        }

        String city = "Delhi";

        if(city=="AGRA") {
            System.out.println("You belongs to "+city);
        }

        if(city!="AGRA"){
            System.out.println("You belongs to another city.");
        }

        // Student Marks Check

        int marks = 70;

        if(marks>60) {
            System.out.println("You get first division");
        }
        if(marks<60) {
            System.out.println("You get second division");
        }

        int mark = 58;

        if(mark>57){
            System.out.println("Get second division");
        }
        if(mark<50) {
            System.out.println("Get third division");
        }

        int Marks = 48;

        if(Marks>46){
            System.out.println("get third division.");
        }
        if(Marks<33){
            System.out.println("YOU ARE FAIL...");
        }
    }
}
