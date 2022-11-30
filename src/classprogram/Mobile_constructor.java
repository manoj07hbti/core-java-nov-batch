package classprogram;

public class Mobile_constructor {


        //data member or properties of the class

        String name="Mobile";
        int price = 80000;
        String colour= "red";
        int ram= 16;
        double screen= 6.7;
        String shape= "rectangular";


        public static void main(String[] args) {
            Mobile_constructor object = new Mobile_constructor();

            System.out.println("The colour of mobile is"+object.colour);
            System.out.println("The price of mobile is"+object.price);
            System.out.println("The shape of mobile is"+object.shape);
            System.out.println("The size of mobile is"+object.screen);
            System.out.println("The ram size of mobile is"+object.ram);
            System.out.println("Colour :"+object.colour + "price :"+object.price + "shape :"+object.shape + "screen size :"+object.screen+"ram size :"+object.ram);

        }
    }


