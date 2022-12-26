package Exception;



public class AccountApp {
  public void cash (int amount) throws MinimumBalanceException{
    if ( amount>5000) {
        System.out.println("you can open account and follow all instructions");
    }
        else{
          throw new MinimumBalanceException("Can not Open An Account as minimum balance is 5000 to open an Account")  ;

    }
    }

    public static void main(String[] args) {
        AccountApp obj = new AccountApp();
        try{
            obj.cash(1000);
        }
       catch (Exception e){

        System.out.println("Exception occurred "+e);
    }
    }
    }

