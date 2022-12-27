package exception;

public class AccountOpeningApp {

     // We have created our own exception or custom exception for the given condition
     // If amount is less than 5000 then MinimumBalanceException --------This Exception Should be thrown

     // Syntax for method: access_specifier  return_type  function or method_name(parameter){code}
     // if else statement : if (Condition expression) {code} else{code}

     // throw and throws---are keywords

     // throw keyword : It is used to throw an Exception programmatically (Where we want to throw an exception then the throw keyword will use there)
     // Where we want to throw an exception then we will use this syntax : throw new Exception(); -----throw new Exception name ();

     // throws keyword : It is used to declare an Exception at the method level (Method Signature)
     // Method Signature : It consists of the method name and the parameter list -----example: demo(parameter)------accountOpen (int amount )
     // public void accountOpen (int amount ) throws MinimumBalanceException{}-------it shows that Exception can occur ,so we will use try and catch block for handling the exception
     // Syntax for try and catch block : try{code that throws the exception} catch(Exception e ){code}
     // Every try block will have at least the one catch block
     // try block can have multiple catch block

      // Note:
      // If an exception will occur then the catch block will execute
      // if an exception will not occur then the catch block will not execute

    public void accountOpen (int amount ) throws MinimumBalanceException{

     if (amount>5000){

       System.out.println(" Eligible for Account Opening....");

     }
      else {

        throw new MinimumBalanceException("Can not Open an Account as the minimum balance is 5000 to open an Account "); // Here we want to throw an exception
                                                                                                                         // So here used it for throwing the exception---throw new Exception name ();

     }


    }


    // Main method to run program
    public static void main(String[] args) {

    // Step1 : Created an object of class ----classname  object_name = new classname();

       AccountOpeningApp accountOpeningApp = new AccountOpeningApp();

    // Step2 : To call method ------object_name.method_name();

    try {
        accountOpeningApp.accountOpen(4000); // here exception is thrown ,so we will use try and catch block for handling the exception
    }                                               // After this our program will not stop
      catch (Exception e){

       System.out.println(" Exception occurred :"+e);


      }


    }


}
