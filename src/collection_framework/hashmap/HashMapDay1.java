package collection_framework.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDay1 {

    public void createhashmap (){
        //SYNTAX: HashMap <DATATYPE_Key, DATATYPE_Value> objName= new HashMap<>();

        HashMap <Integer, String> hashmapobj = new HashMap<>();

        //to add elements in map Syntax : obj.put(key,value);
        hashmapobj.put(1,"Monday");
        hashmapobj.put(3,"Wednesday");
        hashmapobj.put(2,"Tuesday");
        hashmapobj.put(6,"Saturday");
        hashmapobj.put(4,"Thursday");
        hashmapobj.put(5,"Friday");
        hashmapobj.put(7,"Sunday");


        //to read elements in HashMap: obj.get(key);
        System.out.println("Print data on Key 1 " +hashmapobj.get(1));

        // get all the keys using keySet(); Syntax : obj.keySet();
        Set<Integer> keys = hashmapobj.keySet();
        System.out.println("Printing Keys :"+keys);

        for(Integer var : keys){

            System.out.println("Printing map using loop at key : "+var +" Value: "+hashmapobj.get(var));
        }


    }

    public static void main(String[] args) {
        HashMapDay1 obj = new HashMapDay1();
        obj.createhashmap();

    }
}
