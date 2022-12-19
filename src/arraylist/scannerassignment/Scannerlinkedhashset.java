package arraylist.scannerassignment;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Scannerlinkedhashset {
    public LinkedHashSet<String> createHashset() {


        LinkedHashSet<String> hashset = new LinkedHashSet<>();
        Scanner input = new Scanner(System.in);
        String choice = ("y");
        while (choice.equals("y")) {
            System.out.println("Please enter data for linked hashset : ");
            String data = input.nextLine();
            hashset.add(data);
            System.out.println("press y for add more data or press any key for exist");
            choice=input.nextLine();


        }
        return hashset;


    }

    public static void main(String[] args) {
        Scannerlinkedhashset obj = new Scannerlinkedhashset();
        LinkedHashSet<String> hashset=obj.createHashset();
        for(String var:hashset){
            System.out.println("printing of linkedhashset " + var);
        }


    }




}
