package class_and_object;

public class Station {

    String name = "Tundla";
    int employees = 400;
    double salary = 20000.54;

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();

        Station obj = new Station();

        System.out.println("The station name is : " + obj.name);
        System.out.println("the no of employees is :" + obj.employees);
        System.out.println("The salary is : " + obj.salary);
        System.out.println("Name :" + obj.name + " Employees : " + obj.employees + " Salary : " + obj.salary);

        //SYNTAX: ClassName objName= new ClassName();

        Station obj2 = new Station();

        System.out.println("The station name is : " + obj2.name);
        System.out.println("The no of employees is : " + obj2.employees );
        System.out.println("The salary is : " + obj2.salary);
    }
}
