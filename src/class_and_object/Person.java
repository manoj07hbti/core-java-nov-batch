package class_and_object;

public class Person {

    //Data member
    String name;
    int age;
    String city;


    //Parameterized constructor

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {

        //SYNTAX CLassName objName = new ClassName(param1Value , param2Value....);

        Person obj= new Person("Raj",22,"AGRA");

        System.out.println("Printing Person name: "+obj.name +" Age: "+obj.age + " City: "+obj.city);

        Person obj2= new Person("Rahul",24,"DELHI");

        System.out.println("Printing Person name: "+obj2.name +" Age: "+obj2.age + " City: "+obj2.city);

        Person obj3= new Person("Mukesh",21,"JAIPUR");
        System.out.println("Printing Person name: "+obj3.name +" Age: "+obj3.age + " City: "+obj3.city);

    }



}
