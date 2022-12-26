package exception;

public class Accountopening {

    public void accountopening(int amount) throws MinimumBalanceException {

        if (amount > 5000) {

            System.out.println("you are eligible for opening the acccount");
        } else {
             // Syntax - throw new Exception_Class_Name();
            throw new MinimumBalanceException("you are not eligible to open account in this bank");
        }


    }

    public static void main(String[]args){
        Accountopening obj=new Accountopening();
      //  obj.accountopening(4000);   not executed so try catch use to over come this problem as the vale 4000 is exception

        try{
            obj.accountopening(4000);        // exception will occur as the vale is less then 5000
        }
        catch (Exception e){

            System.out.println("printing with exception"+e);
        }
        finally {
            System.out.println("finally key word always use after catch block . person name varun is always elagible ");
        }
    }
}
