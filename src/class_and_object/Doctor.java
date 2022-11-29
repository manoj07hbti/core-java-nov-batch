package class_and_object;

public class Doctor {


    String Name;
    String Address;
    int Age;
    int Mobile;
    double Salary;


    //parameterized constructor


    public Doctor(String name, String address, int age, int mobile, double salary) {
        Name = name;
        Address = address;
        Age = age;
        Mobile = mobile;
        Salary = salary;
    }

    public static void main(String[] args) {

        //SYNTAX CLassName objName = new ClassName(param1Value , param2Value....);

        Doctor obj = new Doctor("Veer","Tundla", 35,987654321,35000.35);
        System.out.println(" Name :" + obj.Name + " Address :" + obj.Address + " Age :" + obj.Age + " Mobile :" +obj.Mobile + " Salary :" + obj.Salary);

        //SYNTAX CLassName objName = new ClassName(param1Value , param2Value....);

        Doctor obj2 = new Doctor("Radhe","Agra", 40,987654991,40000.40);
        System.out.println(" Name :" + obj2.Name + " Address :" + obj2.Address + " Age :" + obj2.Age + " Mobile :" +obj2.Mobile + " Salary :" + obj2.Salary);


        Doctor obj3 = new Doctor("Sultan","Mumbai", 57,987654321,5245687.40);
        System.out.println(" Name :" + obj3.Name + " Address :" + obj3.Address + " Age :" + obj3.Age + " Mobile :" +obj3.Mobile + " Salary :" + obj3.Salary);



    }


}
