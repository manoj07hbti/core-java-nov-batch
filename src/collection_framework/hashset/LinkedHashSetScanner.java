package collection_framework.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class LinkedHashSetScanner {

    public HashSet<String> createlinkedHashSet (){
        // SYNTAX: ClassName <DATATYPE>  objName = new ClassName();
        // HashSet <DATATYPE> objName= new ClassName();

        HashSet <String> linkedhashSetData = new HashSet();

        // Syntax : Scanner objName = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String choice = "Y";
        while (choice.equals("Y")){
            System.out.println("Please Enter Data for LinkedHashSet : ");
            String data = input.nextLine();
            linkedhashSetData.add(data);

            System.out.println("Press Y to add more elements or press any key to exit ");
            choice=input.nextLine();

        }

        return linkedhashSetData;
    }

    public static void main(String[] args) {
        LinkedHashSetScanner obj = new LinkedHashSetScanner();

        HashSet <String> linkedhashsetinputdata = obj.createlinkedHashSet();

        System.out.println("User input HashSet Data : "+linkedhashsetinputdata);

    }
}
