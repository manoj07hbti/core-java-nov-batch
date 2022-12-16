package collection.hashset;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree {
     public void treemethod(){

         TreeSet<Integer> Number = new TreeSet<>();

         Number.add(8);
         Number.add(9);
         Number.add(7);
         Number.add(6);
         Number.add(8);

         System.out.println("Please enter the number :"+Number);

     }

     public void stringmethod(){

         TreeSet<String>name=new TreeSet<>();
         name.add("varun");
         name.add("arun");
         name.add("cat");
         name.add("tarun");
         name.add("ripon");

         System.out.println("please enter the name:"+name);
     }

public void inputfromscanner() {

    TreeSet<Integer> integerTreeSet = new TreeSet<>();
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);


    String flag = "Y";
    while (flag.equals("Y")) {

        System.out.println("please enter the number :");

        Integer value = scanner.nextInt();

        integerTreeSet.add(value);

        System.out.println("Press Y to add more elements or press any key to exit " );
        flag = scanner.nextLine();
        flag=scanner1.nextLine();


    }
        System.out.println("TreeSet Create by user is : " + integerTreeSet);


}

public void inputstring(){

         TreeSet<String>stringTreeSet=new TreeSet<>();

         Scanner scanner=new Scanner(System.in);
         Scanner scanner1=new Scanner(System.in);


         String Choice="Z";
         while(Choice.equals("Z")){
             System.out.println("please enter the name:");
             String name=scanner.nextLine();

             stringTreeSet.add(name);

             System.out.println("press Z to continue and any key to exit");

             Choice=scanner.nextLine();
             Choice=scanner.nextLine();
         }
         System.out.println("Trees set after user input :"+stringTreeSet);
}


    public static void main(String[]args){

         Tree varun=new Tree();
         varun.treemethod();
         varun.stringmethod();
        varun.inputfromscanner();
        varun.stringmethod();
    }
}

