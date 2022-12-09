package conditional_framework;

import java.util.ArrayList;
public class practicearrayList {

    //data member

    String name ="sandeep";
    int age = 25;
    String city = "tundla";
    double height = 5.9;

    // method
    public void biodata(){

    //Syantax --- Classname objname = new classname();

    ArrayList biodata = new ArrayList();

    biodata.add("Sandeep");
    biodata.add(25);
    biodata.add("Tundla");
    biodata.add(5.9);

    //print for particular index
        System.out.println("My name is " + biodata.get(0));
        System.out.println("Age is " + biodata.get(1));
        System.out.println("Place is " + biodata.get(2));
        System.out.println("Height is " + biodata.get(3)+"\n");

        // print all at once

        for (int i=0; i< biodata.size(); i++){
            System.out.println(biodata.get(i)+" index is " + i);
        }
        System.out.println("\n");

        //printing by advance for loop
        //syntax-- Dtatatype varname : collection name/ Array list {code}

        int i=0;
        for (Object var : biodata){
            System.out.println(var + " Index is "+ i);
            i++;
        }

        //after removing some data/index
        System.out.println("\n");

        biodata.remove(3);
        biodata.remove(1);

        for (int j=0; j<biodata.size(); j++ ){
            System.out.println(biodata.get(j) + " index is " + j);
        }
    }

    public static void main(String[] args) {
        practicearrayList obj = new practicearrayList();
        obj.biodata();
    }
}
