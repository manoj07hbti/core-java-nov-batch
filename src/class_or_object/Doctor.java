package class_or_object;

public class Doctor {

    String name = "Dr. Vineet Singh";
    double salary = 50000.00;
    String specialist = "Heart Specialist";
    String work = "City Hospital";

    public static void main(String[] args) {
        Doctor obj = new Doctor();
        System.out.println("Name = "+obj.name+", Salary = "+obj.salary+", Specialist in "+obj.specialist+", and head of Dr. in "+obj.work);
    }
}
