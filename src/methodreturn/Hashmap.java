package methodreturn;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public void demohashmap(){

        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"java");
        map.put(2, "string");
        map.put(3,"boot");
        map.put(4,"springboot");

        System.out.println("print the data at :3 "+map.get(3));
        Set keys=map.keySet();
        System.out.println("print the keys "+keys);

        for(Object var:keys){
            System.out.println("print the keys "+ var + map.get(var));
        }

    }

    public static void main(String[] args) {
        Hashmap obj=new Hashmap();
        obj.demohashmap();
    }
}

