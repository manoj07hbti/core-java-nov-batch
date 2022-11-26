package Array;

public class Advanceloop {
    public static void main(String[] args) {

        //for (datatype var name:array name)

        String country[] = {"Nepal", "Bhutan", "Bangladesh", "America", "India", "Japan"};
        // index=            0        1            2              3         4       5
        System.out.println("All country  : " + country[0]);
        System.out.println("All country  : " + country[1]);
        System.out.println("All country  : " + country[2]);
        System.out.println("All country  : " + country[3]);
        System.out.println("All country  : " + country[4]);
        System.out.println("All country  : " + country[5]);

        //advance for loop marks by for loop
        int marks[] = {21, 34, 36, 47, 58, 60, 76, 85, 93, 99};
        String students[] = {"Sheetal", "Geeta", "Ram", "Shyam", "Radha",  "Harsh","Aman", "Anika", "Shreyansh","naman"};
        for (int i = 0; i < students.length; i++) {
            System.out.println("Marks and students are " + students[i] + " Marks"+ marks[i]);

        }
        }
    }




