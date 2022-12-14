package collection.hashmap;

import java.util.HashMap;
import java.util.Set;


public class DemoHashMap {


    public void createHashMap(){

        //SYNTAX: HashMap <DATATYPE_Key, DATATYPE_Value> objName= new HashMap<>();

        HashMap<Integer, String> map= new HashMap<>();

        map.put(1,"Java");
        map.put(2,"Java8");
        map.put(3,"Spring");
        map.put(4,"Spring boot");
        map.put(5,"Cloud");

        System.out.println("Printing data at key : 3 "+map.get(3));
        System.out.println("Printing data at key : 1 "+map.get(1));
        System.out.println("Printing data at key : 5 "+map.get(5));


        // get all the keys using keySet();

        Set<Integer> keys=map.keySet();
        System.out.println("Printing Keys :"+keys);

        for(Integer var : keys){

            System.out.println("Printing map using loop at key : "+var +" Value: "+map.get(var));
        }

    }


    public static void main(String[] args) {

        DemoHashMap obj = new DemoHashMap();
        obj.createHashMap();

    }
}
