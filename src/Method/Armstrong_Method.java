package Method;

public class Armstrong_Method {


        public static void main(String[] args) {

            int number = 153, originalNumber, remainder, result = 0;

            originalNumber = number;




            while (originalNumber != 0)
            {
                remainder = originalNumber % 10; // 1
                result += remainder*remainder*remainder;
                originalNumber /= 10; //0
            }


           if
             (result == number)
                System.out.println("This number is a armstrong number "+ number);
            else
                System.out.println( "This is not an armstrong number "+ number);
        }
    }



