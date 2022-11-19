package conditional_statements;

public class NestedIf {


    public static void main(String[] args) {

        int age=17;

        if(age>0){

          if(age>18){
              System.out.println("Eligible for Voting ....");
          }
          else {
              System.out.println("Not Eligible for Voting....");
          }


        }

        int PIN=2345;

        if(PIN==1234){

            System.out.println("Welcome to HDFC ATM ..Please choose your option : 1 for balance, 2 withdraw , 3 deposit");

            int choice=1;

            if(choice==1){
                System.out.println("Balance is 234123");
            }
            if(choice==2){
                System.out.println("Please enter amount : ");
            }
            if(choice==3){

                System.out.println("Please put cash ");
            }

        }
        else {

            System.out.println("Wrong Password ....");
        }


    }
}
