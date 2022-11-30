package object_and_class;

public class person {
    // data member
    String name;
    int age;
    String city;
    // parametrized constructor


    public person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        person obj = new person("raj", 26, "agra");
        System.out.println("printing of name : " + obj.name);
        System.out.println("printing of name : " + obj.age);
        System.out.println("printing of name : " + obj.city);
        System.out.println("printing of name : " + obj.city +"age : " +obj.age );
        person obj1= new person("gaurang",24,"jaipur");
        System.out.println("name: "+ obj1.name + " city : " +obj1.city +" age : " +obj1.age);
        person obj2= new person("shushant", 25,"agra");
        System.out.println("name: "+obj2.name + "city :" + obj2.city +"age : " +obj2.age);
        person obj3=new person("arun",25,"awagarh");
        System.out.println("name: "+obj3.name + "city :" + obj3.city +"age : " +obj3.age);


    }
}