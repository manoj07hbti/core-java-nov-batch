package class_and_object;

public class Camera {
    String brand = "Logitech Brio Webcam";
    int mp=16;
    double price= 13999;

    public static void main(String[] args) {
        Camera spec = new Camera();

        System.out.println("Brand - "+spec.brand+" Camera mega Pixel - "+spec.mp+"MP Price is - Rs. "+spec.price+"0/- Only");
    }
}
