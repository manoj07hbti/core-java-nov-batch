package Exception;

public class Bankaccount   {
    public void Bankaccount (int balance) throws Mininumaccoutbalance {
        if(balance >5000){
            System.out.println("Account fulfill the minimum balance criteria");
        }
        else {
            throw new Mininumaccoutbalance("person not have minimum balance in their account i.i less than 5000");
        }
    }

    public static void main(String[] args)  {
        Bankaccount obj =new Bankaccount();
        try {
            obj.Bankaccount(4500);
        }
        catch (Exception e){
            System.out.println("exception is :"+ e);
        }
    }
}
