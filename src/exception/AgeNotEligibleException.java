package exception;

public class AgeNotEligibleException extends Exception{

    public AgeNotEligibleException (String msg) {

        super(msg); // it is used to point parent class
    }
}