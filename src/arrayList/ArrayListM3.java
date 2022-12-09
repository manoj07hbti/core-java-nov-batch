package arrayList;

import java.util.ArrayList;

public class ArrayListM3 {

    public void M3 () {

        String country = "India";
        int state = 28;
        double population = 140000000000.99;

        ArrayList arrayList = new ArrayList();

        arrayList.add("India");
        arrayList.add(28);
        arrayList.add(140000000000.99);

        for (Object var : arrayList) {

            System.out.println("Print all data by M3 : "+var);
        }
    }

    public static void main(String[] args) {

        ArrayListM3 obj = new ArrayListM3();
        obj.M3();
    }
}
