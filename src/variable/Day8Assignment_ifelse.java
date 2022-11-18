package variable;

public class Day8Assignment_ifelse {
    /*  Conditional Statement Syntax if-else
            if (Condition){
                Write the one condition output code
                }
                else{
                Write the other condition output code
                }
        Condition price >1000   costly product
                        <1000  not costly product
         */

    // First Using Only if Conditions

    public static void main(String[] args) {

        int price = 1299;
        if (price>1000){
            System.out.println("Costly Product");
        }
        int price1=999;
        if (price1<1000){
            System.out.println("Not Costly Product");
        }

        // Now Using if-else Conditions

        if (price>1000){
            System.out.println("Costly Product");
        }
        else {
            System.out.println("Not Costly Product");
        }
    }
}
