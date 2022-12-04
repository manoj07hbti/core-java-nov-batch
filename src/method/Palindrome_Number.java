package method;

public class Palindrome_Number {

    public static void main(String[] args) {

        int num = 121, reversedNum = 0, remainder;

        //  OriginalNum
        int originalNum = num;

        // Reverse of originalNum
        // Variables
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome Number .......");
        }
        else {
            System.out.println(originalNum + " is not Palindrome Number ...");
        }
    }
}


