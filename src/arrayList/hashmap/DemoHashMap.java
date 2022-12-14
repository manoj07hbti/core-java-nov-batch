package arrayList.hashmap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {
    public void createHashMap() {

     // SYNTAX : HashMap <DATATYPE_key, DATATYPE_value> objName = new HashMap<>();
        HashMap <Integer, String> map = new HashMap<>();

        // Method - 1
        map.put(1, "Intellij");
        map.put(2, "Laptop");
        map.put(3, "Window10");
        map.put(4, "Dell");

        System.out.println("Printing HashMap at Index 3 : "+map.get(3));
        System.out.println("Printing HashMap at Index 2 : "+map.get(2));
        System.out.println("Printing HashMap at Index 4 : "+map.get(4));

        // Second Method -2
        // get all the keys using keySet
        Set <Integer> keys = map.keySet();
        System.out.println("Printing Keys : "+keys);

        for (Integer var : keys) {
            System.out.println("Printing map using loop at key "+var+" value is - "+map.get(var));
        }
    }

    public static void main(String[] args) {
        DemoHashMap obj = new DemoHashMap();
        obj.createHashMap();

    }
}
