package arrays;

public class ArrayAssignment {

    public static void main(String[] args) {

        //1 - printing price of products by using array

        double[] price = {54.9, 292.94, 497.33, 7.06, 44.41, 994.83, 47.97};

        // accessing data arrayName [INDEX];
        System.out.println("price of product no 5 is = "+price[4]);
        System.out.println("price of product no 6 is = "+price[5]);
        System.out.println("price of product no 2 is = "+price[1]);


        //2 - USING LOOP IN ARRAY

        for (int i = 0; i<price.length; i++) {
            System.out.println("Price by using Loop = "+price[i]);
        }


        //3 -  ADVANCED LOOP...
        for (double v : price) {
            System.out.println("PRODUCT BY USING ADVANCED LOOP = "+v);
        }
    }
}
