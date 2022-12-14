package collection_framework.hashset;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetScanner {

    public TreeSet <String> treeSetMethod (){

        //SYNTAX :  TreeSet <DataType> objName= new TreeSet();
        TreeSet <String> stringtreeset = new TreeSet<>();
        // Syntax : Scanner objName = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String choice = "Y";
        while (choice.equals("Y")){
            System.out.println("Enter Student First Name");
            String firstname = input.nextLine();
            stringtreeset.add(firstname);

            System.out.println("Enter Student Last Name");
            String lastname = input.nextLine();
            stringtreeset.add(lastname);

            System.out.println("Press Y to add more elements or press any key to exit ");
            choice=input.nextLine();
        }
        return stringtreeset;
    }

    public static void main(String[] args) {
        TreeSetScanner obj = new TreeSetScanner();
        TreeSet <String> outstringtreeset = obj.treeSetMethod();

        for (String out : outstringtreeset){
            System.out.println("Name of Student "+out);

        }

    }
}
