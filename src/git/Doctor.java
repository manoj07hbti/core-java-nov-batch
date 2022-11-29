package git;

public class Doctor {
    String name;
    int age;
    String department;

    public Doctor(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {
        Doctor obj=new Doctor("arun",27,"cardiologist");
        System.out.println("name :"+obj.name +" age:"+obj.age +" department: "+obj.department);

        Doctor obj2=new Doctor("sandeep",28,"dermetologist");
        System.out.println("name :"+obj2.name +" age:"+obj2.age +" department: "+obj2.department);

        Doctor obj3=new Doctor("gaurang",26,"jholachaap");
        System.out.println("name :"+obj3.name +" age:"+obj3.age +" department: "+obj3.department);



    }
}
