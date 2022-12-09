package array;

public class PRICEArray {
    public static void main(String[] args) {

        String []product =  new String[]{"shoes", "pent", "shirt", "kurta", "pajama", "dal", "chini", "namak", "tea", "ginger"};
        double []price = new double[]{1200, 1000, 800.50, 1500.75, 1200.65, 120.675, 40.765, 80.777, 120.8753, 20.95};

        // System.out.println("The price of" + product[0] + "is =" + price[0]);
        // System.out.println("The price of" + product[1] + "is =" + price[1]);
        // System.out.println("The price of" + product[4] + "is =" + price[4]);
        // System.out.println("The price of" + product[7] + "is =" + price[7]);


        for (int i = 1; i < product.length; i++) {

        for (int j = 1; j <price.length; j++) {



                System.out.println("The price of the" + i + "is=" + j);
            }

        }
    }
}




