package class_or_object;

public class Engineers {

    // DATA MEMBER

    String name;
    int age;
    String degree;

    // PARAMETERIZED CONSTRUCTOR

    public Engineers(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public static void main(String[] args) {
        Engineers obj =new Engineers("Vineet", 21, "CS");
        System.out.println("Engineer Name ="+obj.name+", Age = "+obj.age+", Degree ="+obj.degree);

        // SECOND OBJECT
        Engineers obj2 =new Engineers("AMIT", 27,"Civil");
        System.out.println("Engineer Name ="+obj2.name+", Age = "+obj2.age+", Degree ="+obj2.degree);

        // THIRD OBJECT
        Engineers obj3 = new Engineers("Raj",22, "CS");
        System.out.println("Engineer Name ="+obj3.name+", Age = "+obj3.age+", Degree ="+obj3.degree);

        // FOURTH OBJECT
        Engineers obj4 = new Engineers("Rahul", 25, "Electrical");
        System.out.println("Engineer Name ="+obj4.name+", Age = "+obj4.age+", Degree ="+obj4.degree);

        // FIFTH OBJECT
        Engineers obj5 = new Engineers("Prince", 19, "CS");
        System.out.println("Engineer Name ="+obj5.name+", Age = "+obj5.age+", Degree ="+obj5.degree);
    }
}
