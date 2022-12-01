package methods;

public class Armstrong_Number {

    // Armstrong number of 351

    public void Armstrong() {

        int number = 352, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }


    // TRY AGAIN ARMSTRONG NUMBER

    public void armstrong () {
        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }
    public static void main(String[] args) {
        Armstrong_Number obj = new Armstrong_Number();
        obj.Armstrong();
        obj.armstrong();

    }
}


