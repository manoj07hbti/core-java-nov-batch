package oops.inheritance;

import java.util.Scanner;

public class School {

    public String studentname (){
        Scanner Stdname = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String Name = Stdname.nextLine();
        return Name;
    }
}
