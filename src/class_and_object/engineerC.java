package class_and_object;

public class engineerC {

    String name;
    String profession;
    String branch;
    int age;
    float salary;

    public engineerC(String name, String profession, String branch, int age, float salary) {
        this.name = name;
        this.profession = profession;
        this.branch = branch;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        //classname obj = new classname ( parameters 1,2,3,4,5,....n );

        engineerC obj =new engineerC("Sandeep","Engineer","Computer Science",25,15.7F);
        System.out.println("Details of Engineer's---->"+"\n"+"Name = " + obj.name+" , "+"Profession = " + obj.profession
        +" , " + "Branch = " + obj.branch +" , " + "Age = " + obj.age +" , " + "Salary (LPA) = " + obj.salary );

        engineerC obj2 = new engineerC("Amit", "Engineer", "Mechanical",26,12.5F);
        System.out.println("Name = " + obj2.name+" , "+"Profession = " + obj2.profession +" , " + "Branch = "
                + obj2.branch +" , " + "Age = " + obj2.age +" , " + "Salary (LPA) = " + obj2.salary );



    }
}
