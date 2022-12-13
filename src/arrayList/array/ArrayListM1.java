package arrayList.array;

import java.util.ArrayList;

public class ArrayListM1 {


    public void M1 () {

        String name1 = "Raj";
        String name2 = "Ram";
        int num1 = 98;
        int num2 = 78;
        double recharge1 = 499.99;
        double recharge2 = 666.99;

        // SYNTAX : ClassName ObjectName = NewClass();
        ArrayList arrayList = new ArrayList();

        arrayList.add("Raj");
        arrayList.add("Ram");
        arrayList.add(98);
        arrayList.add(78);
        arrayList.add(499.99);
        arrayList.add(666.99);


        System.out.println("Printing data at index 0 : " + arrayList.get(0));
        System.out.println("Printing data at index 1 : " + arrayList.get(1));
        System.out.println("Printing data at index 2 : " + arrayList.get(2));
        System.out.println("Printing data at index 3 : " + arrayList.get(3));
        System.out.println("Printing data at index 4 : " + arrayList.get(4));
        System.out.println("Printing data at index 5 : " + arrayList.get(5));
    }

    public static void main(String[] args) {
        ArrayListM1 obj = new ArrayListM1();
        obj.M1();
    }
}
