package oops.abstraction;

public class Automobile extends Company {


    @Override
    public void salary() {
        System.out.println("The salary of  employ is: ");
    }

    @Override
    public void holiday() {
        System.out.println("Number of holidays in month is :");

    }

    @Override
    public void shift() {

        System.out.println("The shift timimg of the employe is :");

    }

    public static void main(String[] args) {

        System.out.println("Welcome to manufacturing sector of india");

        Automobile obj = new Automobile();
        obj.companyname();
        obj.employename();
        obj.department();
        obj.shift();
        obj.holiday();
        obj.salary();
    }
}
