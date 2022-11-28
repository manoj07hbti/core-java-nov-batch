package class_or_object;

public class Mobile {

    // DATA MEMBER
    String name = "Realme 9PRO";
    double price = 18999.99;
    int internal_memory = 512;
    int external_memory = 6;

    public static void main(String[] args) {

        Mobile obj = new Mobile();
        System.out.println("Mobile name is "+obj.name);
        System.out.println("Mobile Price is "+obj.price);
        System.out.println("Mobile ROM is "+obj.internal_memory);
        System.out.println("Mobile RAM is "+obj.external_memory);

        System.out.println("Mobile name is "+obj.name +", Price is "+obj.price +", ROM is "+obj.internal_memory +", RAM is "+obj.external_memory);


    }
}
