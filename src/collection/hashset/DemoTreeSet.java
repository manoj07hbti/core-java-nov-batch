package collection.hashset;

import java.awt.*;
import java.util.Scanner;
import java.util.TreeSet;

public class DemoTreeSet {

    public void stringmethod() {

        TreeSet<String> name = new TreeSet<>();

        name.add("varun");
        name.add("dun");
        name.add("tarun");
        name.add("cat");


        System.out.println("Please enter name : ");
    }

        public void inputFromScanner(){

            TreeSet <String> stringTreeSet = new TreeSet<>();
            Scanner scanner= new Scanner(System.in);

            String Choice="Y";
            while (Choice.equals("Y")){

                System.out.println("Please enter Values for TreeSet: ");

                String value=scanner.nextLine();
                stringTreeSet.add(value);
                System.out.println("Press Y to add more elements or press any key to exit ");
                Choice=scanner.nextLine();
            }

            System.out.println("TreeSet Create by user is : "+stringTreeSet);

        }



        /// to continue code press captal Y







    public static void main(String[]args){


      DemoTreeSet var=new DemoTreeSet();

      var.stringmethod();

      var.inputFromScanner();


    }
}
