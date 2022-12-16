package collection.hashmap;

import collection.model.Studentlist;

import java.util.HashMap;

public class AdvanceMap {

    public HashMap<Integer, Studentlist>createmethod(){

        HashMap<Integer,Studentlist>studentlistHashMap=new HashMap<>();

        Studentlist student1 = new Studentlist("Varun", 45, "cs");
        Studentlist student2= new Studentlist("Arun", 55, "es");
        Studentlist student3 = new Studentlist("Tarun", 65, "me");
        Studentlist student4 = new Studentlist("Varun", 45, "cs");

        studentlistHashMap.put(1,student1);
        studentlistHashMap.put(2,student2);
        studentlistHashMap.put(3,student3);
        studentlistHashMap.put(4,student4);

        return studentlistHashMap;

    }

    public static void main(String[] args) {

        AdvanceMap obj= new AdvanceMap();
        HashMap <Integer, Studentlist> studentHashMap= obj.createmethod();

        for(Integer var : studentHashMap.keySet()){

            System.out.println("Printing student map Name: "+studentHashMap.get(var).getName()+ " Roll no : "+studentHashMap.get(var).getRollNo()+" Section: "+studentHashMap.get(var).getSection());

        }

    }
}


