package Arrays_class;

public class Array_Assignment {

    public static void main(String[] args) {

        //SYNTAX   DataType varName []= {value1,value2,value3, value4....valueN };

        double price[] = {23.05, 65.23, 54.32, 65.21, 78.02, 95.12, 91.25,};

        // Accessing data arrayName[INDEX];

        System.out.println("Data is at in index : " + price[0]);
        System.out.println("Data is at in index : " + price[1]);
        System.out.println("Data is at in index : " + price[2]);


        // print all data of array

        for (int i=0; i<price.length; i++){

            System.out.println("Data is at in index : "+i+ " : "+price [i] );
        }

        // ADVANCED FOR LOOP     for (DATATYPE VarName : arrayName) { CODE }

        for(double var : price){

            System.out.println(" Advanced for loop : "+var);
        }

        //SYNTAX   DataType varName []= {value1,value2,value3, value4....valueN };

        double prices [] ={23.05, 65.23, 54.32, 65.21, 78.02, 95.12, 91.25,};

        for(int i=0; i<price.length; i++){

            System.out.println("Prices is at in index : "+i + " : "+price [i] );
        }

        // ADVANCED FOR LOOP     for (DATATYPE VarName : arrayName) { CODE }
        for (double var : price ){

            System.out.println("Prices is at in index "+var);
        }








    }



}
