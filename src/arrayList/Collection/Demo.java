package arrayList.Collection;

import java.util.ArrayList;

public class Demo {

    public void demo () {

        String city1 = "Agra";
        String city2 = "Jaipur";
        int age = 34;
        double salary = 4564.44;
        int num = 45;

        // SYNTAX : ClassName objName = new ClassName;
        ArrayList arrayList = new ArrayList();

        arrayList.add("Agra");
        arrayList.add("Jaipur");
        arrayList.add(34);
        arrayList.add(4564.44);
        arrayList.add(45);
        arrayList.add("Java");

        System.out.println("Printing data at index 0 : " + arrayList.get(0));
        System.out.println("Printing data at index 3 : " + arrayList.get(3));
        System.out.println("Printing data at index 4 : " + arrayList.get(4));
        System.out.println("Printing data at index 5 : " + arrayList.get(5));


        // printing all data with for loop
        for(int i = 0; i<arrayList.size(); i++) {
            System.out.println("Printing all data in for loop : "+arrayList.get(i));
        }

        // Advance for loop
        for(Object var : arrayList){
            System.out.println("Printing data in advance loop :"+var);
        }

        arrayList.remove(3);
            System.out.println("Data After remove");
            for(Object var : arrayList){
                System.out.println("Printing data in advance loop :"+var);
            }
        }


    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.demo();
    }
}
