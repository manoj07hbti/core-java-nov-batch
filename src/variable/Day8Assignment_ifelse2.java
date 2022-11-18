package variable;

public class Day8Assignment_ifelse2 {
    /*  Conditional Statement Syntax if-else
            if (Condition){
                Write the one condition output code
                }
                else{
                Write the other condition output code
                }
        Condition country  INDIA --- you belongs to india
                                 --- you belongs to some other country
         */

    // First Using Only if Conditions

    public static void main(String[] args) {

        String country = "India";
        if (country == "India"){
            System.out.println("You Belongs To India");
        }
        if (country != "India"){
            System.out.println("You Belongs To Some Other Country");
        }

        // Now Using if-else Conditions

        if (country=="India"){
            System.out.println("You Belongs To India");
        }
        else{
            System.out.println("You Belongs To Some Other Country");
        }

                  // Now Changing Country India to UK


        String country1 = "UK";
        if (country1 == "India"){
            System.out.println("You Belongs To India");
        }
        if (country1 != "India"){
            System.out.println("You Belongs To Some Other Country");
        }

        // Now Using if-else Conditions

        if (country1=="India"){
            System.out.println("You Belongs To India");
        }
        else{
            System.out.println("You Belongs To Some Other Country");
        }
    }
}
