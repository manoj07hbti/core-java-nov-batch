package class_and_object;

public class Doctor {

    // Properties or Data members----name , id , speciality-----surgeon

      String doctorName = "ABC";
      int doctorId =  123;
      String doctorSpeciality = "SURGEON";

    public static void main(String[] args) {

        // To create an object of class(Doctor) using default constructor
        // Syntax : classname  object_name = new classname();

        Doctor doctor = new Doctor(); // doctor ---------object have created

        System.out.println("Doctor name is :"+doctor.doctorName);
        System.out.println("Doctor Id is :"+doctor.doctorId);
        System.out.println("Doctor Speciality is :"+doctor.doctorSpeciality);


        // To print all values in a single line
        System.out.println("Name is:"+doctor.doctorName + "Id is :"+ doctor.doctorId + "Speciality is :"+doctor.doctorSpeciality);






    }






}
