package oops.abstraction;

public class ToyCompany extends Company {
    @Override
    public void salary() {
        System.out.println("Salary is :");

    }

    @Override
    public void holiday() {
        System.out.println("holidays  are :");

    }

    @Override
    public void shift() {
        System.out.println("Sift is :");

    }

    public static void main(String[] args) {

        System.out.println("Welcome Toy manufacturing sector of india ");

        ToyCompany obj = new ToyCompany();
        obj.companyname();
        obj.employename();
        obj.department();
        obj.shift();
        obj.holiday();
        obj.salary();
    }
}
