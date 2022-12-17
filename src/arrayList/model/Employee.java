package arrayList.model;

import java.util.Objects;

public class Employee {

    String name;
    int Id;
    double salary;

    //***** Parameterize constructor *****

    public Employee(String name, int id, double salary) {
        this.name = name;
        Id = id;
        this.salary = salary;
    }

    // ***** HashCode or Equals *****

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Id == employee.Id && Double.compare(employee.salary, salary) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Id, salary);
    }

    // ***** Getter and Setter *****

    // ***** for name *****
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // ***** for Id *****
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

   // ***** for Salary *****
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
