package collection_framework.model;

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
