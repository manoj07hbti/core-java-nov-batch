package collection_framework.hashmap;

import collection_framework.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class AdvanceHashMap {

    public void AdvHashMapMethod (){
        // HashMap <Datatype_key, Datatype_Value > objName= new HashMap<>();

        HashMap<Integer, ArrayList<String>> advanceMap= new HashMap<>();

        // SYNTAX :  ArrayList <Datatype> objName= new ArrayList();
        ArrayList<String> stringarraylistdata = new ArrayList<>();

        stringarraylistdata.add("HashMap is like the legacy Hashtable class");
        stringarraylistdata.add("But it is not Synchronized");
        stringarraylistdata.add("It also allow us to store null value for once");
        stringarraylistdata.add("Null key value always store at zero index");
        stringarraylistdata.add("Java HashMap class implements the Map interface");

        advanceMap.put(1,stringarraylistdata);

        for (Integer map : advanceMap.keySet()){
            System.out.println("About HashMap Point  : "+advanceMap.get(map));
        }

    }
    public static void main(String[] args) {
        AdvanceHashMap obj = new AdvanceHashMap();
        obj.AdvHashMapMethod();

    }
}
