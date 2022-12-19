package model_class.TreeSet;

import java.util.TreeSet;

public class TreeSetAssignment {

    public void createTreeSet(){

        //   SYNTAX: ClassName objName = new ClassName();
        //   TreeSet <DATATYPE> objName = New ClassName();

        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("Haider");
        stringTreeSet.add("Sonu");
        stringTreeSet.add("Mohit");
        stringTreeSet.add("Ritu");
        stringTreeSet.add("Akash");

        System.out.println("Printing all name with TreeSet : " +stringTreeSet);

        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(5);
        integerTreeSet.add(8);
        integerTreeSet.add(2);
        integerTreeSet.add(6);
        integerTreeSet.add(4);

        System.out.println("Printing all numbers with TreeSet : " +integerTreeSet);

        TreeSet<Double> doubleTreeSet = new TreeSet<>();

        doubleTreeSet.add(5.5);
        doubleTreeSet.add(1.5);
        doubleTreeSet.add(3.5);
        doubleTreeSet.add(9.5);
        doubleTreeSet.add(7.5);

        System.out.println("Printing all decimal numbers with TreeSet : " +doubleTreeSet);
    }

    public static void main(String[] args) {

        //   SYNTAX: ClassName objName = new ClassName();
        TreeSetAssignment obj = new TreeSetAssignment();
        obj.createTreeSet();
    }
}
