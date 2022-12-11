package model;

public class Employee {

    String name;
    int ID;
    double salary;

    // *****Parameterize constructor*****


    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }


    // ******getter and setter*****

    // for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    // for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
