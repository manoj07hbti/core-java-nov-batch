package method_class;

public class person {
    String name;
    int age;
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
        person obj=new person();
        obj.eatmethod();
        obj.sleepmethod();obj.workmethod();
    }




}
