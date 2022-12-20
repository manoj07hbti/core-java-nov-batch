package oops.abstraction;

public class Country1 extends Country{
    @Override
    public void name() {
        System.out.println("The one an only INDIA...,");
    }

    @Override
    public void famous_for() {
        System.out.println("India is world famous for TAJ MAHAL which is one of from Seven wonders...,");
    }

    @Override
    public void currency() {
        System.out.println("Rupees are indian currency.");
    }

    public static void main(String[] args) {
        System.out.println("          ******** WELCOME TO MY COUNTRY ********");

        Country1 obj = new Country1();

        obj.Country_specification();
        obj.name();
        obj.famous_for();
        obj.currency();

    }
}
