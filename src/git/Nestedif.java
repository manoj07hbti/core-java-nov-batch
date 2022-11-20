
public class Nestedclass {
    public static void main(String[] args) {
        int pin=1235;
        if(pin==1234){
            System.out.println("welcome to sbi atm..please choose your option:1 for balance,2 for withdrew,3 for pin generation");
            int choice=3;
            if(choice==1){
                System.out.println("balance is 23494");
            }
            if(choice==2){
                System.out.println("collect your money");
            }
            if(choice==3){
                System.out.println("enter pin");
            }



        }
        else{
            System.out.println("wrong password");
        }
    }
}
