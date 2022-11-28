package class_and_object;

public class mobilephone {

    String brand= "Samsung";
    int Ram= 6;
    int memory= 256;

    public static void main(String[] args) {

        //classname objname = new classname();

        mobilephone obj = new mobilephone();

        System.out.println("Brand = " + obj.brand + " Ram = "+ obj.Ram + " Memory = " + obj.memory);


    }
}
