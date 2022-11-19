package variable;

public class Day9Assignment_nestedif {
    /*  Conditional Statement Syntax Nested if
            if (Condition - 1){
                     if (Condition - 2){
                Write the one condition output code
                }
               }
                else{
                Write the other condition output code
                }
        MODULUS OPERATOR is %  remainder
              8%5==  3       (3 is remainder after 8/5)
      */
    public static void main(String[] args) {
        int num = 0;

        if (num>0){
            int result = num%2;
            if (result == 0){
                System.out.println("This is Even Number");
            }
            if (result == 1){
                System.out.println("This is Odd Number");
            }
        }
        else{
            System.out.println("Please Enter Value Greater Than Zero");
        }

    }

}
