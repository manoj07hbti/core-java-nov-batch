package collection.hashmap;

import collection.model.Employee;

import java.util.*;

public class Demo {

public void hasmapmethod() {

    HashMap<Double, String> map = new HashMap<>();

    map.put(1.0, "Varun");
    map.put(2.0, "Arun");
    map.put(3.0, "Tarun");
    map.put(4.0, "Vikas");
    map.put(5.0, "Vishal");


    System.out.println("Printing data at key : 3 " + map.get(3.0));
    System.out.println("Printing data at key : 1 " + map.get(5.0));
    System.out.println("Printing data at key : 5 " + map.get(4.0));

//Set<double>variable=map.KeySet=====syntx
    Set<Double> keys = map.keySet();

    // Hasmap me sorting possible h kya

    System.out.println("Printing Keys :" + keys);

    for (Double var : keys) {

        System.out.println("Printing map using loop at key : " + var + " Value: " + map.get(var));
    }
}

    public void inputfromscanner() {      // CAN we print both key and value given by user at a time with scanner
                                                                      //YES
        HashMap<Double,String> doubleStringHashMap = new HashMap();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        String flag = "Y";
        while (flag.equals("Y")) {

            System.out.println("please enter the number :");

            Double value = scanner.nextDouble();
            String value1=scanner1.nextLine();

            doubleStringHashMap.put(value,value1);

            System.out.println("Press Y to add more elements or press any key to exit " );
            flag = scanner.nextLine();
            flag=scanner1.nextLine();


        }
        System.out.println("TreeSet Create by user is : " + doubleStringHashMap);

    }


    public static void main (String[]args){

        Demo obj = new Demo();
        obj.hasmapmethod();
        obj.inputfromscanner();
    }

}




