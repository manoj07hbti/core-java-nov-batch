package arrayList.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class AdvanceMap {

    public void createAdvanceMap() {

        // HashMap <Datatype_key, Datatype_value> objName = new HashMap<>();

        HashMap <String, ArrayList<String>> AdvanceMap = new HashMap<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Spring");
        stringArrayList.add("Spring boot");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Agra");
        cities.add("Jaipur");

        AdvanceMap.put("A", stringArrayList);
        AdvanceMap.put("B", cities);

        for(String var : AdvanceMap.keySet()) {
            System.out.println("Reading Data : "+AdvanceMap.get(var));
        }
    }

    public static void main(String[] args) {
        AdvanceMap obj = new AdvanceMap();
        obj.createAdvanceMap();
    }
}
