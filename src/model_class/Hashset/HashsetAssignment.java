package model_class.Hashset;

import java.util.HashSet;

public class HashsetAssignment {

    public HashSet<String> createStringHashSet(){

        //SYNTAX: ClassName objName = new ClassName();
        // HashSet <DATATYPE> objName = New ClassName():

        HashSet<String> stringsHashSet = new HashSet();

        stringsHashSet.add("Agra");
        stringsHashSet.add("Tundla");
        stringsHashSet.add("Pune");
        stringsHashSet.add("Goa");
        stringsHashSet.add("Mumbai");
        stringsHashSet.add("Agra");
        stringsHashSet.add("Tundla");
        stringsHashSet.add("Pune");
        stringsHashSet.add("Goa");
        stringsHashSet.add("Mumbai");

        return stringsHashSet;

    }

    public HashSet<Double> createDoubleHashSet (){

        //SYNTAX: ClassName objName = new ClassName();
        // HashSet <DATATYPE> objName = New ClassName();
        HashSet<Double> doubleHashSet = new HashSet();

        doubleHashSet.add(25.25);
        doubleHashSet.add(15.15);
        doubleHashSet.add(35.35);
        doubleHashSet.add(45.45);
        doubleHashSet.add(55.55);
        doubleHashSet.add(25.25);
        doubleHashSet.add(15.15);
        doubleHashSet.add(35.35);
        doubleHashSet.add(45.45);
        doubleHashSet.add(55.55);

        return doubleHashSet;

    }

    public static void main(String[] args) {

        //SYNTAX: ClassName objName = new ClassName();
        HashsetAssignment obj = new HashsetAssignment();
        HashSet<String> StringHashSet= obj.createStringHashSet();

        for (String var : StringHashSet){
            System.out.println("Printing stringHashset : " + var);
        }
        HashSet<Double> doubleHashSet = obj.createDoubleHashSet();
        for (double var : doubleHashSet){
            System.out.println("Printing doubleHashSet : " +var);

        }
    }
}
