package conditional;

public class nestedif { 
    public static void main(String[] args){
    int age=19;
    if (age>18){
        System.out.println("eligible for voting");
    }else{
        System.out.println("not eligible for voting");
    } int pin=1234;
    if(pin==1234){
        System.out.printf("welcome tp atm... choose your option: 1 for balance 2 for deposit 3for withdrwal 4 enquiry");
       int choose=3;
       if(choose==1){
           System.out.println("balance is 34243");
       }
       if(choose==2){
           System.out.println("deposit is224");
       }
       if(choose==3){
           System.out.println("minimum withdrawl is 234");
       }
       if(choose==4){
           System.out.println("call for enquiry100");
       }
    }



    }






























    
}
