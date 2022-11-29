package classobject;

public class Employee {


    String name;
    String department;
    int shift;
    int salary;

    public Employee(String name, String department, int shift, int salary) {
        this.name = name;
        this.department = department;
        this.shift = shift;
        this.salary = salary;
    }

    public static void main(String[] args) {


        Employee rcm = new Employee("RAJESH KHANNA","Production",2,1200);


        System.out.println("Employee 1 Name:"+rcm.name+"   Department:"+rcm.department+"  shift:"+rcm.shift+"  salary:"+rcm.salary);

        Employee rcm2 = new Employee("DINESH SHARMA","Quality",2,1400);


        System.out.println("Employee 1 Name:"+rcm2.name+"   Department:"+rcm2.department+"  shift:"+rcm2.shift+"  salary:"+rcm2.salary);

        Employee rcm3 = new Employee("PAWAN SINGH","Inventory",3,1000);


        System.out.println("Employee 1 Name:"+rcm3.name+"   Department:"+rcm3.department+"  shift:"+rcm3.shift+"  salary:"+rcm3.salary);
    }
}
