package class_and_object;

public class Employee {

    // declare data member
    String name;
    String post;
    int salary;

    // parameterized constructor

    public Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public static void main(String[] args) {
        // accessing obj data SYNTAX - ClassName ObjName = new ClassName (Value 1, Value 2,......);
        Employee details = new Employee("Jethalal","Lead Actor",150000);
        System.out.println("Actor Name : "+details.name+"\n"+" Post : "+details.post+"\n"+" Salary : "+details.salary);

        Employee details2 = new Employee("Meheta Sahab","Actor",100000);
        System.out.println("Actor Name : "+details2.name+"\n"+" Post : "+details2.post+"\n"+" Salary : "+details2.salary);

        Employee details3 = new Employee("Iyer","Actor",95000);
        System.out.println("Actor Name : "+details3.name+"\n"+" Post : "+details3.post+"\n"+" Salary : "+details3.salary);
    }

}
