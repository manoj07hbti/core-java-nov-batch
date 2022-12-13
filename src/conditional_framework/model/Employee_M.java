package conditional_framework.model;

import java.util.Objects;

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
    //hash code and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_M that = (Employee_M) o;
        return age == that.age && Double.compare(that.salary, salary) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
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
