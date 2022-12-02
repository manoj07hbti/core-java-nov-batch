package Method;

public class Palindrome_Method {


        public static void main(String[] args) {

            int num = 121, reversednum = 0, remainder;

            // store the number to originalNum
            int originalnum = num;


            while (num != 0) {
                remainder = num % 10;
                reversednum = reversednum * 10 + remainder;
                num /= 10;
            }


            if (originalnum == reversednum) {
                System.out.println(originalnum + " is Palindrome ");
            }
            else {
                System.out.println(originalnum + " is not Palindrome ");
            }
        }
    }





