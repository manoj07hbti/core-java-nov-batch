package class_or_object;

public class Employee {

    // DATA MEMBER

    String name;
    int Id;
    int age;

    // Parameterized Constructor


    public Employee(String name, int id, int age) {
        this.name = name;
        Id = id;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee obj = new Employee("Vineet", 2, 25);
        System.out.println("Employee name ="+obj.name+", Employee Id ="+obj.Id+", Age ="+obj.age);

        // SECOND OBJECT
        Employee obj2 = new Employee("Anmol",3, 22);
        System.out.println("Employee name ="+obj2.name+", Employee Id ="+obj2.Id+", Age ="+obj2.age);

        // THIRD OBJECT
        Employee obj3 = new Employee("Amit", 4,30);
        System.out.println("Employee name ="+obj3.name+", Employee Id ="+obj3.Id+", Age ="+obj3.age);

        // FOURTH OBJECT
        Employee obj4 = new Employee("Amit", 5, 20);
        System.out.println("Employee name ="+obj4.name+", Employee Id ="+obj4.Id+", Age ="+obj4.age);

        //FIFTH OBJECT
        Employee obj5 =new Employee("Pankaj", 6,26);
        System.out.println("Employee name ="+obj5.name+", Employee Id ="+obj5.Id+", Age ="+obj5.age);
    }
}
