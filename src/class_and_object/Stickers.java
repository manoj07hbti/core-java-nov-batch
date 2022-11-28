package class_and_object;

public class Stickers {

    String type = "Aesthetic";
    int height = 90;
    int length = 180;
    double price = 299.99;

    public static void main(String[] args) {
        //SYNTAX: ClassName objName= new ClassName();

        Stickers prop = new Stickers();

        // Accessing new object  - Syntax - objName.propertyname;

        System.out.println("Sticker Type - "+prop.type+" Length - "+prop.length+"CM Height - "+prop.height+
                "CM and price - Rs. "+prop.price+"/- Only");
    }

}
