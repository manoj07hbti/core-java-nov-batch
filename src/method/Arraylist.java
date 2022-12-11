package method;

import basics.Demo;

import java.util.ArrayList;

public class Arraylist {
    public void Demo(){
        String city="agra";
        String city2="delhi";
        int age=26;
        double salary=23.4;

        ArrayList arraylist=new ArrayList();

        arraylist.add("agra");
        arraylist.add("delhi");
        arraylist.add(26);
        arraylist.add(23.4);
        arraylist.add("java");


        for(int i=0; i<arraylist.size();i++){
        System.out.println("printing data in loop "+arraylist.get(i) +" at index "+i);
        }
        for(Object var: arraylist){
            System.out.println("printing data in loop "+var);
        }
        arraylist.remove(2);
        System.out.println("after remove");
        for(int i=0; i<arraylist.size();i++){
            System.out.println("printing data in loop "+arraylist.get(i) +" at index "+i);
        }

    }

    public static void main(String[] args) {
        Arraylist obj =new Arraylist();
        obj.Demo();
    }
}
