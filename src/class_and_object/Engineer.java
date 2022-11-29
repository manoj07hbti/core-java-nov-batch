package class_and_object;

public class Engineer {
    String dep;
    String post;
    double salary;

    public Engineer(String dep, String post, double salary) {
        this.dep = dep;
        this.post = post;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Engineer obj = new Engineer("IT","Sr. Software Eng.",60000);
        System.out.println("Department : "+obj.dep+", Post : "+obj.post+", Salary is : "+obj.salary);

        Engineer obj2 = new Engineer("Mechanical","Faculty",65000);
        System.out.println("Department : "+obj2.dep+", Post : "+obj2.post+", Salary is : "+obj2.salary);

        Engineer obj3 = new Engineer("CS","Software Eng.",55000);
        System.out.println("Department : "+obj3.dep+", Post : "+obj3.post+", Salary is : "+obj3.salary);

    }
}
