package collection_framework.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetScanner {

    public HashSet <String> createHashSet (){
        // SYNTAX: ClassName <DATATYPE>  objName = new ClassName();
        // HashSet <DATATYPE> objName= new ClassName();

        HashSet <String> hashSetData = new HashSet();

        // Syntax : Scanner objName = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String choice = "Y";
        while (choice.equals("Y")){
            System.out.println("Please Enter Data for HashSet : ");
            String data = input.nextLine();
            hashSetData.add(data);

            System.out.println("Press Y to add more elements or press any key to exit ");
            choice=input.nextLine();

        }

        return hashSetData;
    }

    public static void main(String[] args) {
        HashSetScanner obj = new HashSetScanner();

        HashSet <String> hashsetinputdata = obj.createHashSet();

        System.out.println("User input HashSet Data : "+hashsetinputdata);

    }
}
