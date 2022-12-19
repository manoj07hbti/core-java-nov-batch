package arraylist.scannerassignment;

import java.util.HashSet;
import java.util.Scanner;

public class scannerhashset {
    public HashSet<String> createscannerhashset(){
        HashSet<String> hashSet = new HashSet<>();
        Scanner input =new Scanner(System.in);
        String choice ="y";
        while(choice.equals("y")) {
            System.out.println("Please enter data for hashset : ");
            String data = input.nextLine();
            hashSet.add(data);
            System.out.println("press y for add data or press any key for exist");
            choice=input.nextLine();

        }
        return hashSet;
    }

    public static void main(String[] args) {
        scannerhashset obj =new scannerhashset();
      HashSet<String> hashSet =obj.createscannerhashset();
    }
}
