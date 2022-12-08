package collection_framework;

import java.util.ArrayList;

public class ArraylistDay1 {
    public void arraylistmethod() {

        //SYNTAX: ClassName objName = new ClassName();

        ArrayList arrayList = new ArrayList(); // object is created
        arrayList.add("Step 1 - Create Object & use add method to store data"); // 0 INDEX
        arrayList.add("//Syntax is : add(object); to store data ");//1 INDEX
        arrayList.add("//Syntax be like : arrayList.add(data to store)");//2 INDEX
        arrayList.add("Step 2 - To access the data use get method ");//3 INDEX
        arrayList.add("//Syntax is : get(index); index value start from 0 to where your data finish ");//4 INDEX
        arrayList.add("Step 3 - to print all data use  System.out.println();");// 5 INDEX
        arrayList.add("// Syntax be like : arrayList.get(0)");// 6 INDEX
        arrayList.add(8);        // 7 INDEX
        arrayList.add("December");// 8 INDEX
        arrayList.add(2022);// 9 INDEX

        // Printing all data one by one
        System.out.println("Printing Data at index 0 " +arrayList.get(0));
        System.out.println("Printing Data at index 1 " +arrayList.get(1));
        System.out.println("Printing Data at index 2 " +arrayList.get(2));
        System.out.println("Printing Data at index 3 " +arrayList.get(3));
        System.out.println("Printing Data at index 4 " +arrayList.get(4));
        System.out.println("Printing Data at index 5 " +arrayList.get(5));
        System.out.println("Printing Data at index 6 " +arrayList.get(6));
        System.out.println("Printing Data at index 7 " +arrayList.get(7));
        System.out.println("Printing Data at index 8 " +arrayList.get(8));
        System.out.println("Printing Data at index 9 " +arrayList.get(9));

        // printing using for loop
        for (int i=0; i<arrayList.size(); i++ ){
            System.out.println("Printing Data via for loop " +arrayList.get(i));
        }
        // printing using advance for loop
        for (Object advanceloop : arrayList){
            System.out.println("Printing via advance loop : "+advanceloop);
        }
        // deleting some data
        arrayList.remove(9); //  to remove data

        // printing using for loop
        for (int i=0; i<arrayList.size(); i++ ){
            System.out.println("Printing Data after delete via for loop " +arrayList.get(i));
        }
        // printing using advance for loop
        for (Object advanceloop : arrayList){
            System.out.println("Printing via after delete advance loop : "+advanceloop);
        }
    }

    public static void main(String[] args) {
        ArraylistDay1 obj = new ArraylistDay1();
        obj.arraylistmethod();
    }
}
