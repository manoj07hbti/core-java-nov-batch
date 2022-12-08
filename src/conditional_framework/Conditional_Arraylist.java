package conditional_framework;

import java.util.ArrayList;

public class Conditional_Arraylist {

    public void arraylist (){

        //Reference Data

        String Brand = "Samsung Galaxy S22 Ultra 5G";
        int Camera = 108;
        int Battery = 5000;
        int Ram = 12;
        int Price = 850;
        String Network = "2G,3G,4G,5G";
        String Launch = "09 february, 2022";
        double Weight = 229.1;
        String Display = "Dynamic Amoled 2x";
        double Size = 6.8;
        String OS = "Android 12";

        //method

        //Syntax -- classname obj name = new Classname();

        ArrayList arrayList = new ArrayList();

        arrayList.add("Samsung Galaxy S22 Ultra 5G");
        arrayList.add(108);
        arrayList.add(500);
        arrayList.add(12);
        arrayList.add(850);
        arrayList.add("2G,3G,4G,5G");
        arrayList.add("09 february, 2022");
        arrayList.add(229.1);
        arrayList.add("Dynamic Amoled 2x");
        arrayList.add(6.8);
        arrayList.add("Android 12");


        //Print for particular index

        System.out.println("Brand name of phone is " + arrayList.get(0));
        System.out.println("Camera (Mega pixles )" + arrayList.get(1)+"\n");

        //printing all index at one time.
        System.out.println("All the features of mobile phone ------\n");

        for (int i =0; i<arrayList.size(); i++){

            System.out.println(arrayList.get(i) +"-- Index is " + i);
        }
        System.out.println("\n");
        System.out.println("Print Details of mobile phone by Advance  for loop \n");

        //For advance loop
        //Syntax--- Datatype varname : collection name / arrayList );{code}

        for (Object var : arrayList){
        System.out.println(var);
        }

        //removing index then print the details

        System.out.println("\n");
        System.out.println("Print Details of mobile phone after Removing one element \n");

        arrayList.remove(5);
        arrayList.remove(7);
        arrayList.remove(3);

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i) + "--Index is " + i);
        }

        //After removing one data the index numbering is also gets changed.
    }


    public static void main(String[] args) {
        Conditional_Arraylist obj =new Conditional_Arraylist();
        obj.arraylist();
    }
}


