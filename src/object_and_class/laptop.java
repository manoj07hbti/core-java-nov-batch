package object_and_class;
public class laptop {
    String brand= "hp";
    int ram=4;
    double price =30000.82;

    public static void main(String[] args) {
        laptop obj = new laptop();
        System.out.println("brand of :" + obj.brand + "ram is :" + obj.ram + "price is:" + obj.price);
        System.out.println("brand of" + obj.brand);
        System.out.println("ram is :0" + obj.ram);
        System.out.println("price is" + obj.price);
    }


}
