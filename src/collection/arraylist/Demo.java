package collection.arraylist;

import java.util.ArrayList;

public class Demo {

    //method

    public void demo(){

        String city1="Agra";
        String city2="Delhi";
        int age=21;
        double salary=34500.25;

        //SYNTAX: ClassName objName = new ClassName();

        ArrayList arrayList= new ArrayList(); // object is created

        arrayList.add("Agra"); // 0 INDEX
        arrayList.add("Delhi");//1 INDEX
        arrayList.add(21);//2 INDEX
        arrayList.add(34500.25);//3 INDEX
        arrayList.add("Java");// 4 INDEX



        System.out.println("Printing Data at index 0 " +arrayList.get(0));

        System.out.println("Printing Data at index 3 " +arrayList.get(3));

        System.out.println("Printing Data at index 1 " +arrayList.get(1));

        System.out.println("Printing size of arrayList "+arrayList.size());

        // printing all data

        for(int i=0; i<arrayList.size(); i++){

         System.out.println("Printing data in loop "+arrayList.get(i) +" at INDEX "+i);

        }

        //Advanced for loop
       // SYNTAX : for(DATATYPE var: collectionName/array){
        //
        //}

        for(Object var : arrayList){

            System.out.println("Printing ADVANCED LOOP : "+var);
        }

        arrayList.remove(2);

        System.out.println("DATA AFTER REMOVE ");
        for(int i=0; i<arrayList.size(); i++){

            System.out.println("Printing data in loop "+arrayList.get(i) +" at INDEX "+i);

        }
    }




    public static void main(String[] args) {

        Demo obj= new Demo();
        obj.demo();

    }
}
