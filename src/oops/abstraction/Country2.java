package oops.abstraction;

public class Country2 extends Country{
    @Override
    public void name() {
        System.out.println("America is Second Country,");
    }

    @Override
    public void famous_for() {
        System.out.println("America is famous for STATUE OF LIBERTY,");
    }

    @Override
    public void currency() {
        System.out.println("Dollar is American Currency.");
    }

    public static void main(String[] args) {
        System.out.println("          ******** WELCOME TO MY COUNTRY ********");

        Country2 obj = new Country2();

        obj.Country_specification();
        obj.name();
        obj.famous_for();
        obj.currency();
    }
}
