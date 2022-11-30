package object_and_class;

public class employee {
    String name;
    int experience;
    double salary;




    public employee (String name, int experience, double salary) {

        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    public static void main(String[] args) {


            employee obj = new employee("gaurang", 5, 125.23);
            System.out.println("employee name is: " + obj.name + " exp.: " + obj.experience + " salary : " + obj.salary);
            employee obj2=new employee("lalu",5,125.32);
        System.out.println("employee name is: " + obj2.name + " exp.: " + obj2.experience + " salary : " + obj2.salary);


        }
    }









