package collection_framework.hashset;

import java.util.HashSet;

public class HashsetDemo {
                // String Data Method
    public HashSet<String> stringHashSetMethod(){

        // SYNTAX: ClassName <DATATYPE>  objName = new ClassName();
        // HashSet <DATATYPE> objName= new ClassName();
        HashSet<String> stringData = new HashSet();

        stringData.add("HashSet store unique data in primitive DataType");
        stringData.add("String, int, Double these are primitive DataType");
        stringData.add("which datatype created via user is Non-Primitive DataType like - student, employee");

        return stringData;
    }
            // Integer data method
    public HashSet<Integer> integerHashSetMethod(){
        // SYNTAX: ClassName <DATATYPE>  objName = new ClassName();
        // HashSet <DATATYPE> objName= new ClassName();
        HashSet<Integer> integerdata = new HashSet();

        integerdata.add(15);
        integerdata.add(78);
        integerdata.add(45);
        integerdata.add(55);
        integerdata.add(78);

        return integerdata;
    }
            // Double Data Method
    public HashSet<Double> doubleHashSetMethod(){
        // SYNTAX: ClassName <DATATYPE>  objName = new ClassName();
        // HashSet <DATATYPE> objName= new ClassName();
        HashSet <Double> doubledata = new HashSet();

        doubledata.add(2553.2);
        doubledata.add(4654.45);
        doubledata.add(56466.456);

        return doubledata;
    }




    public static void main(String[] args) {
        HashsetDemo obj = new HashsetDemo();                        // object for class
        HashSet<String> stringdataobj = obj.stringHashSetMethod(); // object for string method
        int i = 1;
        for (String var : stringdataobj){      // syntax : for (datatype varName : objName(where you store data))
            System.out.println("String Data : Point "+i+" "+var);
            i++;
        }

        HashSet<Integer> integerdataobj = obj.integerHashSetMethod(); // Object for Integer method
        i=1;
        for (int var : integerdataobj){
            System.out.println("Integer Data : Point "+i+" "+var);
            i++;
        }

        HashSet<Double> doubledataobj = obj.doubleHashSetMethod();
        for(Double var : doubledataobj){
            System.out.println("Double Data : "+var);

        }

    }
}
