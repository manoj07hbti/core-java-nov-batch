package class_and_object;

public class Employee {


    String name;
    String Department;
    String city;
    int mobile;
    int age;
    int aadhaar;
    double salary;

    //Parameterized constructor


    public Employee(String name, String department, String city, int mobile, int age, int aadhaar, double salary) {
        this.name = name;
        Department = department;
        this.city = city;
        this.mobile = mobile;
        this.age = age;
        this.aadhaar = aadhaar;
        this.salary = salary;
    }

    public static void main(String[] args) {

     //   SYNTAX Classname objName = new Classname();

        Employee obj = new Employee("Sonu Kumar", "Java developer", "Pune", 1234567865, 40, 1234567656, 40000.40);
        System.out.println("Name : " + obj.name + " Department : " + obj.Department + " city : " + obj.city + " Mobile : " + obj.mobile + " Age : " + obj.age + " Aadhaar : " + obj.aadhaar + " Salary : " + obj.salary);




        Employee obj2 = new Employee("Haider Ali Abbas", "Java developer", "Agra", 1234567892, 28, 1234567896, 35000000.35);
        System.out.println("Name : " + obj2.name + " Department : " + obj2.Department + " city : " + obj2.city + " Mobile : " + obj2.mobile + " Age : " + obj2.age + " Aadhaar : " + obj2.aadhaar + " Salary : " + obj2.salary);




        Employee obj3 = new Employee("Mohit Kumar", "Java developer", "Delhi", 1234567823, 25, 1234567847, 35000.35);
        System.out.println("Name : " + obj3.name + " Department : " + obj3.Department + " city : " + obj3.city + " Mobile : " + obj3.mobile + " Age : " + obj3.age + " Aadhaar : " + obj3.aadhaar + " Salary : " + obj3.salary);


        Employee obj4 = new Employee("Ritu Raaz Nigam", "Java developer", "Mumbai", 1234567814, 35, 1234567858, 20000.35);
        System.out.println("Name : " + obj4.name + " Department : " + obj4.Department + " city : " + obj4.city + " Mobile : " + obj4.mobile + " Age : " + obj4.age + " Aadhaar : " + obj4.aadhaar + " Salary : " + obj4.salary);


    }
}
