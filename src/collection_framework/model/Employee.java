package collection_framework.model;

import java.util.Objects;

public class Employee {

    // This is Model Class of Employee
    // Model Class stores the information of Employee
    // Properties or Data Members or Instance Variables of Employee -------name,age,department,id,and salary  etc.


     String name;
     int age;
     String department;
     int id;
     double salary;

     // Parameterized Constructor


    public Employee(String name, int age, String department, int id, double salary) {
        this.name = name;    // this.instance variable of class = local variable
        this.age = age;
        this.department = department;
        this.id = id;
        this.salary = salary;
    }

    // Override hashcode and equals method

    // Equality will check on the basis of age ,id,salary,name ,department
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && id == employee.id && Double.compare(employee.salary, salary) == 0 && name.equals(employee.name) && department.equals(employee.department);
    }


     // Java will give the same hashcode for the same object on the basis of name, age, department, id, salary
    @Override
    public int hashCode() {
        return Objects.hash(name, age, department, id, salary);
    }


    // Getter and Setter
    // Getter Method : It is used for getting data or reading the data
    // Setter Method : It is used to change the data


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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
