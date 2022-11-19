package conditional_statement;

public class Marks {
    public static void main(String[] args) {
        int marks = 50;

        if (marks>=60){
            System.out.println("first");
        }
        if (marks<60) {
            if (marks>=50){
                System.out.println("SECONd");
        }
            if (marks<50){
            if (marks>=33){
                System.out.println("third");
            }else {
                System.out.println("Failed");
        }
            }
        }
    }
}
