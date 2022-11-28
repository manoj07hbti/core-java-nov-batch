package class_or_object;

public class City {

    String name = "AGRA";
    String famous = "TAJ MAHAL";
    int ticket = 100;
    String sweet = "PETHA";
    int population = 250000;

    public static void main(String[] args) {

        City obj = new City();
        System.out.println("City name = "+obj.name);
        System.out.println("Agra is famous for = "+obj.famous);
        System.out.println("Ticket of Taj Mahal = "+obj.ticket);
        System.out.println("Sweet is famous in AGRA = "+obj.sweet);
        System.out.println("Population of Agra = "+obj.population);

        System.out.println("City name = "+obj.name+", famous for = "+obj.famous+", Ticket = "+obj.ticket+", Famous Sweet = "+obj.sweet+", Population = "+obj.population);
    }
}
