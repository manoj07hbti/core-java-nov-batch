package arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class advancehashmap {
    public void createmap() {
        HashMap<String, ArrayList<String>> advanceMap = new HashMap<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("java");
        stringArrayList.add("spring");
        stringArrayList.add("springboot");
        stringArrayList.add("hypernate");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("agra");
        cities.add("delhi");
        cities.add("pune");
        cities.add("kolkta");
        cities.add("hyderabad");

        advanceMap.put("A", stringArrayList);
        advanceMap.put("B", cities);
        for (String var : advanceMap.keySet()) {
            System.out.println("reading of advance hashmap :" +advanceMap.get(var));

        }
    }

    public static void main(String[] args) {
        advancehashmap obj=new advancehashmap();
        obj.createmap();

    }
    }