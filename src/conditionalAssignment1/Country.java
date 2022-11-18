package conditionalAssignment1;

import java.sql.SQLOutput;

public class Country {

    public static void main(String[] args) {

        String Country = "India";
        if (Country=="India") {
            System.out.println("You Belongs To INDIA...");
        }
        else {
            System.out.println("You Belongs To Other Country...");
        }

        String country = "England";
        if (country == "India") {
            System.out.println("You belongs to India...");
        }
        else {
            System.out.println("You belongs to other country....");
        }
    }
}
