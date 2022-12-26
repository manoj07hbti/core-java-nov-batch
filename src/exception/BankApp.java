package exception;

public class BankApp {

    public void Bank(int Amount) throws MinimumBalanceAccount{

        if (Amount>5000) {

            System.out.println("He can open your an account ..... : ");
        }
        else {

            throw new MinimumBalanceAccount("He can not open your an account ..... : ");
        }
    }

    public static void main(String[] args) {

        BankApp obj = new BankApp ();
        try{
            obj.Bank(7000);

        }
        catch (Exception e){

            System.out.println("Exception occurred "+e);
        }

    }

}



