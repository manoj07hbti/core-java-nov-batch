package collection.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoAdvanceMap {

    public void createMap(){

      // HashMap <Datatype_key, Datatype_Value > objName= new HashMap<>();

        HashMap<String, ArrayList<String >> advanceMap= new HashMap<>();

        ArrayList<String> stringArrayList= new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("Spring ");
        stringArrayList.add("Spring boot");

        ArrayList<String> cities= new ArrayList<>();

        cities.add("Agra");
        cities.add("Jaipur");
        cities.add("Kanpur");

        advanceMap.put("A",stringArrayList);
        advanceMap.put("B",cities);

        for (String var : advanceMap.keySet()){

            System.out.println("Reading data :" +advanceMap.get(var));

        }



    }


    public static void main(String[] args) {

        DemoAdvanceMap obj= new DemoAdvanceMap();
        obj.createMap();
    }
}
