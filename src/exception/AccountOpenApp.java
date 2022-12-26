package exception;

public class AccountOpenApp {

    public void Account(int amount) throws MinimumBalanceException {

        if (amount >= 5000) {
            System.out.println("Eligible for Open Account in our bank....");
        } else {
            throw new MinimumBalanceException("Parson's Balance is less than 5000 so not eligible for one account in our bank.");
        }
    }


    public static void main(String[] args) {
        AccountOpenApp obj = new AccountOpenApp();

        try{
            obj.Account(5000);
        }
        catch(Exception e) {
            System.out.println("Exception Occurred : "+e);
        }

    }
}
