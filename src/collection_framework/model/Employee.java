package collection_framework.model;

import java.util.Objects;

public class Employee {
    String name;
    String department;
    int desk;

    // Parameterized Constructor

    public Employee(String name, String department, int desk) {
        this.name = name;
        this.department = department;
        this.desk = desk;
    }

    // hashcode & equals (Right Click > Generate > equals() and hashcode())

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return desk == employee.desk && name.equals(employee.name) && department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, desk);
    }

    // Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDesk() {
        return desk;
    }

    public void setDesk(int desk) {
        this.desk = desk;
    }
}
