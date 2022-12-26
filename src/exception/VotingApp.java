package exception;

public class VotingApp {

    public void voting(int age) throws AgeNotElligibleException{

        if(age>18){

          System.out.println("Eligible for voting ");
        }
        else {

            throw new AgeNotElligibleException("Person Age is less than 18 so not Eligible for Voting ");
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
