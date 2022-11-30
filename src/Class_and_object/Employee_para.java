package Class_and_object;

public class Employee_para {

    // Data member
    String name;
    int age;
    String city;
    String company;

    //Parameterised constructor
    public Employee_para(String name, int age, String city, String company) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.company = company;
    }

    public static void main(String[] args) {

        //   Syntax class name obj name = new class name (para 1 value , para 2 value.....);


        Employee_para obj = new Employee_para("aman", 30, "Haridwar", "Microsoft");

        System.out.println("Show its name:" + obj.name + " age:  " + obj.age + "   city: " + obj.city + " company: " + obj.company);

        Employee_para obj2 = new Employee_para("Ranjna", 33, "Goa", "Amazon");

        System.out.println("Show its name:" + obj2.name + " age: " + obj2.age + " city: " + obj2.city + "  company: " + obj2.company);


        Employee_para obj3 = new Employee_para("Pooja", 30, "Mumbai", "TCS");

        System.out.println("Show its name:" + obj3.name + " age: " + obj3.age + " city: " + obj3.city + "  company: " + obj3.company);

    }
}