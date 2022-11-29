package class_and_object;

public class employeeC {

    String name;
    int age;
    double salary;

    public employeeC(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public static void main(String[] args) {

        //classname obj = new classname ( parameter 1,2,3,4,5....n);

        employeeC obj = new employeeC("Rahul",22 ,20000.34);
        System.out.println("Details of Employee----1 >"+"\n"+"Name = " + obj.name+"\n"+"Age = " + obj.age
                +"\n"+ "Salary = " + obj.salary);

        employeeC obj2 = new employeeC("Sandeep",25,2500000.500);
        System.out.println("Details of Employee----2 >"+"\n"+"Name = " + obj2.name+"\n"+"Age = " + obj2.age
                +"\n"+ "Salary = " + obj2.salary);


    }
}
