package CollectionFramwork.HashMap;

import java.util.Set;

import java.util.HashMap;

public class DemoHashMap {
    public void createHashMap() {

        //SYNTAX: HashMap <DATATYPE_Key, DATATYPE_Value> objName= new HashMap<>();

        HashMap<Integer, String> hashdata = new HashMap<>();

        hashdata.put(1, "Name");
        hashdata.put(2, "age");
        hashdata.put(3, "salary");
        hashdata.put(4, "company");
        hashdata.put(5, "Department");

        System.out.println("Print at  key : 1 " + hashdata.get(1));
        System.out.println("Print at key : 2 " + hashdata.get(2));
        System.out.println("Print key : 3 " + hashdata.get(3));
        System.out.println("Print at key : 4 " + hashdata.get(4));


        Set<Integer> keys =hashdata.keySet();
        System.out.println("Printing Keys :" + keys);

        for (Integer var : keys) {

            System.out.println("Print by loop at key : " + var + " Value: " + hashdata.get(var));
        }

    }

    public static void main(String[] args) {

        DemoHashMap obj = new DemoHashMap();
        obj.createHashMap();

    }
}

