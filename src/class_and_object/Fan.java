package class_and_object;

public class Fan {
    String brand = "Bajaj";
    int rpm = 500;
    int voltage = 240;
    int amp = 10;

    public static void main(String[] args) {
        Fan specs = new Fan();
        System.out.println("Brand "+specs.brand+" Specs: RPM - "+specs.rpm+", "+specs.voltage+" Volt, "+specs.amp+" AMP");
    }
}
