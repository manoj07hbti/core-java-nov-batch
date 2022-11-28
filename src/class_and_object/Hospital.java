package class_and_object;

public class Hospital {

    String Name = "Railway Hospital";
    int Doctors = 12;
    double salary = 35000.20;

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();
        Hospital obj = new Hospital();

        System.out.println("The hospital name is : " + obj.Name);
        System.out.println("The number of doctors is : " + obj.Doctors);
        System.out.println("The salary is : " + obj.salary);
        System.out.println("Name : " + obj.Name + " Doctors : " + obj.Doctors + " Salary : " + obj.salary);

        Hospital obj2 = new Hospital();

        System.out.println("The hospital name is : " + obj2.Name);
        System.out.println("The number of doctors is : " + obj2.Doctors);
        System.out.println("The salary is : " + obj2.salary);
        System.out.println("Name : " + obj2.Name + " Doctors : " + obj2.Doctors + " Salary : " + obj2.salary);

    }
}
