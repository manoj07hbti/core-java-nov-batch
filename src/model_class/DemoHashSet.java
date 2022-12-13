package model_class;

import java.util.HashSet;

public class DemoHashSet {

    public HashSet<String> createStringHashSet(){

        //SYNTAX: ClassName <DATATYPE>  objName = new ClassName();

        // HashSet <DATATYPE> objName= new ClassName();

        HashSet<String> stringHashSet= new HashSet();

        stringHashSet.add("Sonu Kumar");
        stringHashSet.add("Mohit Kumar");
        stringHashSet.add("Rohit");
        stringHashSet.add("Rahul");
        stringHashSet.add("Rahul");
        stringHashSet.add("Rohit");
        stringHashSet.add("Sonu Kumar");
        stringHashSet.add("Rohit");
        stringHashSet.add("Raj");
        stringHashSet.add("Raj");
        stringHashSet.add("Rohit");
        stringHashSet.add("Mohit Kumar");

        return stringHashSet;

    }


    public HashSet<Integer> createIntHashSet(){
        // HashSet <DATATYPE> objName= new ClassName();

        HashSet <Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(40);
        integerHashSet.add(35);
        integerHashSet.add(30);
        integerHashSet.add(25);
        integerHashSet.add(20);
        integerHashSet.add(40);
        integerHashSet.add(35);
        integerHashSet.add(30);
        integerHashSet.add(25);
        integerHashSet.add(20);

        return integerHashSet;
    }

    // Double HashSet

    public static void main(String[] args) {

        DemoHashSet obj = new DemoHashSet();
        HashSet<String> stringHashSet= obj.createStringHashSet();

        for(String var : stringHashSet){

            System.out.println("Printing stringHashSet: "+var);
        }

        HashSet<Integer> integerHashSet= obj.createIntHashSet();

        for(Integer var: integerHashSet){

            System.out.println("printing integerHashSet: "+var);
        }

    }
}



