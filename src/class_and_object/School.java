package class_and_object;

import java.util.Scanner;

public class School {

    String name="INTER COLLEGE";
    int noOfTeacher=12;
    int noOfRooms=20;


    public static void main(String[] args) {

        School obj= new School(); // creating object using default constructor

        System.out.println("Printing School Object : "+obj.name);
        System.out.println("Printing School Object : "+obj.noOfRooms);
        System.out.println("Printing School Object : "+obj.noOfTeacher);
    }
}
