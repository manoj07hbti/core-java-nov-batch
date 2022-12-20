package Conditional_Statement;

public class RevisionIfElse {

    public static void main(String[] args) {

        int age = 15;

        if(age>18) {
            System.out.println("Eligible for voting.");
        }
        else {
            System.out.println("Not eligible for voting.");
        }

        String city = "Delhi";

        if(city == "AGRA"){
            System.out.println("YOU belongs to AGRA.");
        }
        else{
            System.out.println("You belongs to another city.");
        }

        // Price
        double Car_price = 56456.54;

        if(Car_price> 10000){
            System.out.println("Car is costly.");
        }
        else{
            System.out.println("Car is cheapest");
        }

        // COUNTRY

        String country = "INDIA";

        if(country=="INDIA") {
            System.out.println("You belongs to India.");
        }
        else{
            System.out.println("You belongs to other country.");
        }
    }
}
