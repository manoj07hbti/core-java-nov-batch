package method_class;

public class engineer {
    String name;
    int salary;
    public void workmethod(){
        System.out.println("this is work method");
    }
    public void eatmethod(){
        System.out.println("this is eat method");
    }
    public void sleepmethod(){
        System.out.println("this is sleep method");
    }

    public static void main(String[] args) {
        engineer obj=new engineer();
        obj.eatmethod();
        obj.sleepmethod();
        obj.workmethod();

    }





}
