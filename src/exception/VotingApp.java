package exception;

public class VotingApp {

    public void voting(int age) throws AgeNotEligibleException {

        if (age > 18) {
            System.out.println("Eligible for voting..");
        } else {
            throw new AgeNotEligibleException("Person's age is less than not 18 so not eligible for voting");
        }
    }


    public static void main(String[] args) {
        VotingApp obj = new VotingApp();

        try{
            obj.voting(11);
        }
        catch(Exception e) {
            System.out.println("Exception Occurred : "+e);
        }

    }
}
