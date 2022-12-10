package collection;

import java.util.ArrayList;

public class List {
    //name cant be the ArrayList as method name too


    public void demo() {

        // object name can be any thing


        ArrayList name = new ArrayList();//array list syntex

        name.add("varun");//index 0 to add
        name.add("delhi"); //index 1
        name.add("12000");//using   .add    method
        name.add(3927.9387);
        name.add("ok");
        name.add("thats 354774.355");
        name.add(25344);


        System.out.println("method use is .get to print the vale that is " + name.get(0));
        System.out.println("method use is .get to print the vale that is " + name.get(1));
        System.out.println("method use is .get to print the vale that is " + name.get(2));//  objectname.get  use to print
        System.out.println("method use is .get to print the vale that is " + name.get(3));
        System.out.println("method use is .get to print the vale that is " + name.get(4));
        System.out.println("method use is .get to print the vale that is " + name.get(5));   //printing will be done using objectname.get
        System.out.println("method use is .get to print the vale that is " + name.get(6));


        for (int a = 0; a < name.size(); a++) {      //  < important sign    (name.) is the object name used in ArrayList


            System.out.println("printing using for loop method :" + name.get(a)+ "index number is "+a); // a is variable in for loop
            // printing done using objectname.get method passing variable in index

        }
             // (object) is data type use in array list    variable name(can be any name) :  object name of ArrayList
         for(Object variable: name){  //   : imp

            System.out.println("Printing using advance for loop:"+variable);// printing will be done using variable name

        }
         name.remove(3);    // syntax:   objectname .remove
         name.remove(5);

        for (int a = 0; a < name.size(); a++) {      //  for loop after deleting index by  using .remove


            System.out.println("printing using for loop method after deleting index 3 5 is :" + name.get(a)+ "index number is "+a);

        }
        int g=0;  // INDEX TO PRINT IN ADVANCE FOR LOOP
        for(Object variable: name){  //   : imp

            System.out.println("Printing using advance for loop after removing index:"+variable +" INDEX at:  "+g);// printing will be done using variable name
         g++;   // INDEX TO BE PRINTED IN ADVANCE FOR LOOP ( AFTER REMOVE COMMAND)
        }  // can we print index number in advance for loop


    }

            public static void main (String[]args){


                //class name .obj=new class name

                List varun = new List();

                varun.demo();


            }    // public void main bracket

        }          // class bracket class name List


