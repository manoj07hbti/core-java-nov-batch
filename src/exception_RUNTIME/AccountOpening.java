package exception_RUNTIME;

public class AccountOpening {

        public void accountOpening (int amount) throws MinimumBalanceException {

            if (amount>5000){
                System.out.println("Person is eligible for account opening");
            }
            else {

                //use thorw new  and throws key word with parent class ---in the method or signature---

                throw new MinimumBalanceException ("Person is not eligible for account opening \n" +
                        "\"Can not Open An Account as minimum balance is 5000 to open an Account");

            }
    }

    public static void main(String[] args) {
        AccountOpening obj = new AccountOpening();
        // use try and catch
        try {
            obj.accountOpening(577);
        }catch (Exception e){
            System.out.println("Exception occurred "+e);
        }

    }
}
