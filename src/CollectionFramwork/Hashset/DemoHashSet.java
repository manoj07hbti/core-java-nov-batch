package CollectionFramwork.Hashset;

import java.util.HashSet;

public class DemoHashSet {

    //to avoid using of duplicate data,we use Hashset
    // To creating String data
    public HashSet<String> createStringHashSet() {

        // Syntax: Class name <Datatype> obj.name = new name();
        // HashSet<Datatype> obj name =new HashSet();

        HashSet<String> StringHashSet = new HashSet();

        StringHashSet.add("Html");
        StringHashSet.add("Java");
        StringHashSet.add("Python");
        StringHashSet.add("PHP");
        StringHashSet.add("C++");
        StringHashSet.add("Swift");
        StringHashSet.add("JavaScript");

        return StringHashSet;
    }

    // To Creating int data
    public HashSet<Integer> createIntegerHashSet() {

        // Syntax: Class name <Datatype> obj.name = new name();
        // HashSet<Datatype> obj name =new HashSet();

        HashSet<Integer> IntegerHashSet = new HashSet();

        IntegerHashSet.add(205335);
        IntegerHashSet.add(30455);
        IntegerHashSet.add(3453576);
        IntegerHashSet.add(1223663);
        IntegerHashSet.add(1236544);
        IntegerHashSet.add(7982346);
        IntegerHashSet.add(557687);
        IntegerHashSet.add(7687945);
        IntegerHashSet.add(48868688);
        IntegerHashSet.add(234335);

        return IntegerHashSet;
    }

    public HashSet<Double> createDoubleHashSet() {

        // Syntax: Class name <Datatype> obj.name = new name();
        // HashSet<Datatype> obj name =new HashSet();

        HashSet<Double> DoubleHashSet = new HashSet();

        DoubleHashSet.add(11.33);
        DoubleHashSet.add(333.33);
        DoubleHashSet.add(222.88);
        DoubleHashSet.add(777.55);
        DoubleHashSet.add(333.556);

        return DoubleHashSet;

    }

    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        HashSet<String> StringHashSet = obj.createStringHashSet();

        // By using Advance for loop

        for (String var : StringHashSet) {
            System.out.println("all data of String  Hashset : " + var);

        }
            HashSet<Integer> IntegerHashSet = obj.createIntegerHashSet();

            // By using Advance for loop

            for (Integer var : IntegerHashSet) {
                System.out.println("All Data of Integer HashSet " + var);
            }
                // By using Advance for loop
                HashSet<Double> DoubleHashSet = obj.createDoubleHashSet();
                for (Double var : DoubleHashSet) {
                    System.out.println("all data of Double HashSet  : " + var);

                }
            }

}


/*public  HashSet<String> createStringHashSet(){

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
}*/