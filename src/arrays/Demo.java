package arrays;

public class Demo {

    public static void main(String[] args) {

        String names [] = {"Vinni", "Java", "Core Java", "Spring", "Spring boot"};

        // method 1
        System.out.println("Data at index  3 -  "+names[3]);
        System.out.println("Data at index  2 - "+names[2]);
        System.out.println("Data at index  1 - "+names[1]);


        // method 2 for loop, for print all data of array
        for(int i = 0; i< names.length; i++) {
            System.out.println("[================================================]");
            System.out.println("Printing array at index "+i+" : "+names[i]);
        }


        // method 3 Advanced for loop, for print all data of array
        for(String var : names) {
            System.out.println("Print all data by Advanced for loop : "+var);
            System.out.println("[================================================]");
        }


        int marks[] = {25,24,21,64,84,61,31,87,94,15,05,78,77};

        for(int i = 0 ; i< marks.length; i++) {
            System.out.println("Marks at index "+i+" : "+marks[i]);
        }

        for(Integer var : marks) {
            System.out.println("marks : "+var);
        }



    }

}

