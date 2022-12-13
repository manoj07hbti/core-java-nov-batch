package arrayList.array;

import java.util.ArrayList;

public class ArrayListM2 {

    public void M2 () {

        String city1 = "Mumbai";
        String city2 = "Bangalore";
        int age1 = 34;
        int age2 = 29;
        double salary = 78000.99;


        ArrayList arrayList = new ArrayList();

        arrayList.add("Mumbai");
        arrayList.add("Bangalore");
        arrayList.add(34);
        arrayList.add(29);
        arrayList.add(78000.99);


        System.out.println("Print size of M2 : "+ arrayList.size());
       for (int i =0; i < arrayList.size() ; i++ ) {

           System.out.println("print M2 at index "+i+ " - " +arrayList.get(i));
       }
    }

    public static void main(String[] args) {
        ArrayListM2 obj = new ArrayListM2();
        obj.M2();
    }
}
