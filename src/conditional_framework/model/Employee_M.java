package conditional_framework.model;

public class Employee_M {

    String name;
    int age;
    double salary;

    //parameterozed constructor


    public Employee_M(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
