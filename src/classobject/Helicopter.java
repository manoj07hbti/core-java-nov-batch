package classobject;

public class Helicopter {

    String name="apache";
    int year= 2019;
    double price=1298745.097;
    String country="USA";

    public static void main(String[]args){


        Helicopter sup = new Helicopter();

        System.out.println("The name of Helicopter is ="+sup.name);
        System.out.println("The name of the owner is ="+sup.country);
        System.out.println("The year of import is is ="+sup.year);
        System.out.println("The price of Helicopter is ="+sup.price);

        System.out.println("Name="+sup.name+"  county="+sup.country+"  year="+sup.year+"  price="+sup.price);
    }

}
