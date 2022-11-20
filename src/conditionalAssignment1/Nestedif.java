package conditionalAssignment1;

public class Nestedif {

    public static void main(String[] args) {

        int age = 17;

        if (age>4) {

            if (age > 18) {
                System.out.println("Eligible for voting...");
                }
            else {
                System.out.println("Not Eligible for voting...");
                }
            }

        int PIN = 1234;

        if(PIN==1234) {

            System.out.println("Welcome to HDFC Bank ATM...Please select your option, 1- Balance 2- Withdraw Money 3- Deposite.");

            int choice=2;

            if(choice==1) {
                System.out.println("Balance is 231453");
            }

            if(choice==2) {
                System.out.println("Please enter amount : ");
            }

            if(choice==3) {
                System.out.println("Please put cash");
            }
        }

        else{
            System.out.println("Wrong Password.");
        }
    }
}


