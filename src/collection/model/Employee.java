package collection.model;

import java.util.Objects;

public class Employee {

    String name;
    String department;
    int id;
    double salary;

    //hashset


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, id, salary);
    }

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
