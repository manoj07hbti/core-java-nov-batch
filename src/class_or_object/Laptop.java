package class_or_object;

public class Laptop {
    String name = "DELL";
    String model = "DESKTOP-LG7SRM4";
    String edition = "Windows 10 Pro";
    int installed_ram = 8;
    String version = "22H2";
    double price = 90850.99;

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        System.out.println("LAPTOP NAME = "+obj.name+", Model = "+obj.model+", Edition = "+obj.edition+", Ram = "+obj.installed_ram+", Version = "+obj.version+", Price = "+obj.price);
    }

}
