package class_or_object;

public class Country {

    String name = "INDIA";
    int state = 28;
    int union_territories = 8;
    String national_bird = "PEACOCK";
    String national_animal = "TIGER";
    String father_of_the_nation = "MAHATMA GANDHI";

    public static void main(String[] args) {

        Country obj = new Country();
        System.out.println("COUNTRY NAME = "+obj.name);
        System.out.println("STATES = "+obj.state);
        System.out.println("UNION TERRITORIES = "+obj.union_territories);
        System.out.println("NATIONAL BIRD = "+obj.national_bird);
        System.out.println("NATIONAL ANIMAL = "+obj.national_animal);
        System.out.println("FATHER OF NATION = "+obj.father_of_the_nation);

        System.out.println("COUNTRY NAME = "+obj.name+", STATES = "+obj.state+", UNION TERRITORIES = "+obj.union_territories+", NATIONAL BIRD = "+obj.national_bird+", NATIONAL ANIMAL = "+obj.national_animal+", FATHER OF NATION = "+obj.father_of_the_nation);


    }
}
