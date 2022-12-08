package CollectionFramwork;

import java.util.ArrayList;

  public class ArrayListDemo {

      //  creating the method

      public void demo() {

          String name = "Ram";
          String city = "Delhi";
          int age = 22;
          String company = "Microsoft";
          Double salary = 65000.00;
          String qualification = "Graduate";
          String status = "working";

          // Syntax: class name obj name = new class name();

          ArrayList arrayList = new ArrayList(); // object is creating

          // All add method will add Index
          // index  always start from number 0...1...2..3...4..........

          arrayList.add("Ram");    // 0 INDEX
          arrayList.add("Delhi");  //1 INDEX
          arrayList.add(22);      //2 INDEX
          arrayList.add("Microsoft"); //3 INDEX
          arrayList.add(65000.00); // 4 INDEX
          arrayList.add("Graduate");// 5 index
          arrayList.add("working"); // 6 index

          System.out.println("printing data at index" + arrayList.get(0));
          System.out.println("printing data at index" + arrayList.get(1));
          System.out.println("printing data at index" + arrayList.get(2));
          System.out.println("printing data at index" + arrayList.get(3));
          System.out.println("printing data at index" + arrayList.get(4));
          System.out.println("printing data at index" + arrayList.get(5));
          System.out.println("printing data at index" + arrayList.get(6));


          // (.size method ===  when we use this method so it cover all  show size of method

          System.out.println("printing data at index" + arrayList.size());

          // Printing all  method by for loop

          for (int i = 0; i < arrayList.size(); i++) {
              System.out.println("Printing data in for loop " + arrayList.get(i) + " at index" + i);
          }
          // By using the Advance for loop
          // syntax : for (Datatype var:collection name /array){
          // code
          //}

          for (Object var : arrayList) {
              System.out.println(" Printing advance for loop : " + var);

          }

          //  by using  remove method

          arrayList.remove(2);
          arrayList.remove(3);
          arrayList.remove(4);
          System.out.println("Data after remove");

          for (int i = 0; i < arrayList.size(); i++) {
              System.out.println("printing data in loop " + arrayList.get(i) + " at index" + i);
          }



      }
      public static void main (String[]args){

          ArrayListDemo obj = new ArrayListDemo();
          obj.demo();
      }

  }





