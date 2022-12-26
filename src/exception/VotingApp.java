package exception;

public class VotingApp {


    public void voting(int age) throws AgeNotEligibleException{

        if (age>18) {

            System.out.println("He is eligible for voting..... : ");
        }
        else {

            throw new AgeNotEligibleException("He is not eligible for voting..... : ");
        }
    }

    public static void main(String[] args) {

        VotingApp obj = new VotingApp();
        try{
            obj.voting(17);

        }
        catch (Exception e){

            System.out.println("Exception occurred "+e);
        }

    }

}



