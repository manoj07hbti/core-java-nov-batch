package git;

public class Employee {
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {
        Employee obj= new Employee("arun",26,"mechanical");
        System.out.println("name of employee: "+obj.name +" age: "+obj.age +" department: "+obj.department);

        Employee obj2=new Employee("gaurang",26,"civil");
        System.out.println("name of employee: "+obj2.name +" age: "+obj2.age +" departmnet: "+obj2.department);

            Employee obj3=new Employee("ankit",26,"electrical");
        System.out.println("name of employee: "+obj3.name +" age: "+obj3.age +" departmnet: "+obj3.department);
    }
}
