package conditionalStatement;

public class NOToperator {
    public static void main(String[] args) {
        int age = 18;
        if (!(age > 21)) {
            System.out.println(" You eligible for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }


        String city = "agra";
        if( !(city =="agra")) {
            System.out.println("You are eligible for voting in agra");
        }
        else {
            System.out.println("You are not eligible for voting in agra");

        }
        int number=43;
        if(number!=40||number>40){
            System.out.println("your number is not greater then 40");
        }
        else{
            System.out.println("your number is greater then 40");
        }
    }
}
