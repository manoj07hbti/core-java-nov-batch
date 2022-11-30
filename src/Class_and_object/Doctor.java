package Class_and_object;

public class Doctor {
    // Data member
    String name;
    int age;
    String city;
    int salary=123456789;

    public Doctor(String name, int age, String city, int salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
    }

    public Doctor(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Parameterized constructor

    public static void main(String[] args) {

        //   Syntax class name obj name = new class name (para 1 value , para 2 value, para 3 value.....);


        Doctor obj = new Doctor("Sameer", 22, "Delhi");
        System.out.println("Printing Person name: " + obj.name + " Age: " + obj.age + " City: " + obj.city);

        Doctor obj2 = new Doctor("rahul", 24, "agra");
        System.out.println("Printing Person name: " + obj.name + " Age: " + obj.age + " City: " + obj.city);

        Doctor obj3 = new Doctor("Naman", 25, "pune");
        System.out.println("Printing Person name: " + obj.name + " Age: " + obj.age + " City: " + obj.city);

        Doctor obj4 = new Doctor("aman", 26, "kolkata");
        System.out.println("Printing Person name: " + obj.name + " Age: " + obj.age + " City: " + obj.city);

    }
    }