package functions_methods;

public class EmployeeM {

    String employeename;
    int age;
    double salary;

    //method
    //work,department,sleep

    public void work(){
        System.out.println("10 hours");
    }
    public void department(){
        System.out.println("engineering");
    }
    public void sleep(){
        System.out.println("6 hours");
    }

    public static void main(String[] args) {
        EmployeeM obj = new EmployeeM();
        obj.work();
        obj.department();
        obj.sleep();
    }
}
