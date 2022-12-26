package Exception;

public class AccountApp {

    public void AccountOpen (int amt) throws MinimumBalanceException{

        if (amt>5000){
            System.out.println("You can open account please attach following documents.");
        }
        else {
            // Syntax - throw new Exception_Class_Name();
            throw new MinimumBalanceException("Can not Open An Account as minimum balance is 5000 to open an Account");
        }
    }

    public static void main(String[] args) {
        AccountApp obj = new AccountApp();
        try {
            obj.AccountOpen(1500);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
