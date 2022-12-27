package exception;


// Step1- Make Exception class as the parent
public class MinimumBalanceException  extends  Exception {



      // How to create your own Exception or Custom Exception :
      // Step1- Make Exception class as the parent ( First, we will make a class and extends the class from the Exception class due to which we will get all behavior of the Exception)
      // Step2- Override constructor with message ( because we want to print the message at the time of throwing the Exception )
      // super keyword : It is used to point to the parent class


    // Step2- Override constructor with message
       public MinimumBalanceException (String msg){



        super(msg);   // super keyword : It is used to point to the parent class
                      // Here parent class-----Exception

       }


}
