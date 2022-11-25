package Arrays_class;

public class Array_demo_1 {

    public static void main(String[] args) {

        //SYNTAX   DataType varName []= {value1,value2,value3, value4....valueN etc.};

        String cities [] = {"SAWAI MADHOPUR","KOTA","PUNE","JAIPUR","KANPUR","GOA","AGRA","TUNDLA"};

        // Accessing data arrayName[INDEX];

        System.out.println("Data at INDEX 1 is : "+cities[1]);
        System.out.println("Data at INDEX 3 is : "+cities[3]);
        System.out.println("Data at INDEX 6 is : "+cities[6]);

        // print all data of array

        for (int i=0; i<cities.length; i++){

            System.out.println("Printing array in Loop at INDEX : "+i+ " : "+cities[i]);
        }

        // ADVANCED FOR LOOP     for (DATATYPE VarName : arrayName) { CODE }

        for(String var : cities){

            System.out.println("Printing using advanced for loop : "+var);
        }

        //SYNTAX   DataType varName []= {value1,value2,value3, value4....valueN };

        int marks [] ={33,50,62,23,35,78,97,35,78,45,49,98,34,56};

        for(int i=0; i<marks.length; i++){

            System.out.println("MARKS at INDEX : "+i + " : "+marks[i]);
        }

        // ADVANCED FOR LOOP     for (DATATYPE VarName : arrayName) { CODE }
        for (int var : marks){

            System.out.println("Printing marks using Advanced loop "+var);
        }







    }
}
