package loops;

public class assignmentadvanceloops {

    double p1=33.33;
    double p2= 12.10;
    double p3=55.55;

    public static void main(String[] args) {

        //SYNTAX -- Datatype Varname[] = {Value 1,2,3,4,5_____n};

        double price [] = {33.33,12.10,55.55};
        System.out.println("price of index 0 = "+price[0]);


        //for print all data of array

        for (int i=0; i< price.length; i++){
            System.out.println("price of index " +i+"="+price[i]);
        }

        //for advanced loop
        //SYNTAX --- for(datatype varname : arrayname){code}

        for (double var:price){
            System.out.println("price of index = "+ var);
        }



    }



}
