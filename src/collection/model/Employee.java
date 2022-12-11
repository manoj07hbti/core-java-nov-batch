package collection.model;

public class Employee {

    String name;
    String department;
    int id;
    double salary;

    public Employee(String name, String department, int id, double salary) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}
