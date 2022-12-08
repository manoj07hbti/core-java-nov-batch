package arrayList;

import java.util.ArrayList;

public class Demo {

   // method

   public void demo () {

       String city1 = "Agra";
       String city2 = "Delhi";
       String city3 = "Jaipur";
       double salary1 = 2345.34;
       double salary2 = 50000.49;
       double salary3 = 12443.65;
       int age1 = 21;
       int agr2 = 24;
       String name1 = "Vineet";
       String name2 = "Singh";

       // SYNTAX : ClassName ObjectName = NewClass();
       // method 1

       ArrayList arrayList = new ArrayList(); // obj Created...

       arrayList.add ("Agra");
       arrayList.add ("Delhi");
       arrayList.add ("Jaipur");
       arrayList.add (2345.49);
       arrayList.add (50000.49);
       arrayList.add (12443.65);
       arrayList.add (21);
       arrayList.add (24);
       arrayList.add ("Vineet");
       arrayList.add ("Singh");

       System.out.println("Printing data at index 0 :" +arrayList.get(0));
       System.out.println("Printing data at index 1 :" +arrayList.get(1));
       System.out.println("Printing data at index 2 :" +arrayList.get(2));
       System.out.println("Printing data at index 3 :" +arrayList.get(3));
       System.out.println("Printing data at index 4 :" +arrayList.get(4));
       System.out.println("Printing data at index 5 :" +arrayList.get(5));
       System.out.println("Printing data at index 6 :" +arrayList.get(6));
       System.out.println("Printing data at index 7 :" +arrayList.get(7));
       System.out.println("Printing data at index 8 :" +arrayList.get(8));
       System.out.println("Printing data at index 9 :" +arrayList.get(9));



       // for loop
       System.out.println("Printing size of arraylist :" +arrayList.size());


       // method 2
       // printing all data from for loop

       for (int i=0 ; i < arrayList.size() ; i++) {

           System.out.println("Printing for loop at index = " +i+" - "  + arrayList.get(i));
       }

       // method 3
       // printing all data from advanced for loop

       for (Object var : arrayList) {
           System.out.println("Printing all data by advanced for loop :" +var);
       }

       // method 4
       // removing object

       arrayList.remove(3);
       System.out.println("after removing object");

       for (int i=0 ; i < arrayList.size() ; i++) {

           System.out.println("Printing for loop at index = " +i+" - "  + arrayList.get(i));
       }

   }

    public static void main(String[] args) {

       Demo obj = new Demo();
       obj.demo();
    }
}
