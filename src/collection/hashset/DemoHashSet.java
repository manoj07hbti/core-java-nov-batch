package collection.hashset;


import java.util.HashSet;

public class DemoHashSet {

    public  HashSet<String> createStringHashSet(){

        //SYNTAX: ClassName <DATATYPE>  objName = new ClassName();

        // HashSet <DATATYPE> objName= new ClassName();

        HashSet<String> stringHashSet= new HashSet();

        stringHashSet.add("Java");
        stringHashSet.add("Java8");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring boot");
        stringHashSet.add("Spring boot");
        stringHashSet.add("Spring");
        stringHashSet.add("Java");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring boot");
        stringHashSet.add("Spring boot");
        stringHashSet.add("Spring");
        stringHashSet.add("Java");

        return stringHashSet;

    }


    public HashSet<Integer> createIntHashSet(){
        // HashSet <DATATYPE> objName= new ClassName();

        HashSet <Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(33);
        integerHashSet.add(50);
        integerHashSet.add(45);
        integerHashSet.add(78);
        integerHashSet.add(98);
        integerHashSet.add(33);
        integerHashSet.add(50);
        integerHashSet.add(45);
        integerHashSet.add(78);
        integerHashSet.add(98);

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
