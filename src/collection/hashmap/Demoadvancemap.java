package collection.hashmap;

import collection.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class Demoadvancemap {


        public void createMap(){

            // HashMap <Datatype_key, Datatype_Value > objName= new HashMap<>();

            HashMap<String, ArrayList<String >> advanceMap= new HashMap<>();

            ArrayList<String> stringArrayList= new ArrayList<>();
            stringArrayList.add("ball");
            stringArrayList.add("Spring ");              // no return type
            stringArrayList.add("bat");

            ArrayList<String> cities= new ArrayList<>();

            cities.add("jabalpur");
            cities.add("Jaipur");
            cities.add("Kanpur");

            advanceMap.put("A",stringArrayList);
            advanceMap.put("B",cities);

            for (String var : advanceMap.keySet()){

                System.out.println("Reading data :" +advanceMap.get(var));

            }



        }


        public static void main(String[] args) {

            Demoadvancemap obj= new Demoadvancemap();
            obj.createMap();
        }
    }

