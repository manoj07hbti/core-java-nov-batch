package git;

public class Array {
    public static void main(String[] args) {
        // normal method;
        double price[]={23.3,34.6,27.1,67.8,56.4,45.6,44.2,15.6,};
        System.out.println("price of product "+price[5]);




        //for loop method;
        for(int i=0;i<price.length;i++){
            System.out.println("price of product is "+price[i]);
        }




        //advance loop;
        for(double var:price){
            System.out.println("price of product is "+var);
        }




    }
}
