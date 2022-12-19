package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class AdvanceHashMap {


    public void createAdvanceHashMap(){

        // HashMap <Datatype_key, Datatype_Value > objName= new HashMap<>();

        HashMap<String, ArrayList<String>> AdvanceHashMap = new HashMap<>();

        ArrayList<String> stringArrayList= new ArrayList<>();
        stringArrayList.add("Haider");
        stringArrayList.add("Ali");
        stringArrayList.add("Abbas");
        stringArrayList.add("Mariya");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Agra");
        cities.add("Goa");
        cities.add("Pune");
        cities.add("Kota");

        AdvanceHashMap.put("A",stringArrayList);
        AdvanceHashMap.put("B",cities);

        for (String var : AdvanceHashMap.keySet()){

            System.out.println("Printing all data with Advance HashMap  : " +AdvanceHashMap.get(var));

        }

    }

    public static void main(String[] args) {

        AdvanceHashMap  obj= new AdvanceHashMap();
        obj.createAdvanceHashMap();

    }


}
