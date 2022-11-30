package method_class;

public class doctor {
    String name;
    int salary;
    int experience;
    public void namemethod(){
        System.out.println("this is name method");
    }
    public void salarymethod(){
        System.out.println("this is salary method");
    }
    public void experiencemethod(){
        System.out.println("this is my experience method");
    }

    public static void main(String[] args) {
        doctor obj= new doctor();
        obj.namemethod();
        obj.experiencemethod();
        obj.salarymethod();

    }



}
