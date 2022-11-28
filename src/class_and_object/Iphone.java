package class_and_object;

public class Iphone {
    String variant = "14 pro max";
    int storage = 512;
    double screen= 6.9;

    public static void main(String[] args) {
        Iphone feature=new Iphone();
        System.out.println("Iphone "+feature.variant+" Storage - "+feature.storage+"GB Screen Size - "+feature.screen+" inches");
    }
}
