package conditional_statement;

public class Nested_If {

    public static void main(String[] args) {

        int age = 20;

        if (age>0){

            if (age>18){
                System.out.println("you can drive .....");
            }
            else {
                System.out.println("you can not drive.....");

            }

        }

        int x = 15;

        if ( x >0){

            if ( x >18){
                System.out.println("can i drive ? ...");
            }
            else {
                System.out.println("yes you can drive ......");
            }
        }

        int pin = 1234;
        if (pin == 9536){
            System.out.println("welcome to ICICI Bank.....please choose your option : 1 for balance, 2 for withdraw, 3 deposite");

            int choice = 1;
            if (choice== 1){
                System.out.println("your balance is 231456");
            }
            if (choice == 2){
                System.out.println("please enter your amount...");
            }
            if (choice == 3){
                System.out.println("please put your cash....");
            }
        }
        else {
            System.out.println("your password is wrong....");
        }

    }
}
