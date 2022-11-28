package class_or_object;

public class PMofINDIA {

    String name = "Narendra Modi";
    String post = "PM OF INDIA";
    double salary = 2500000;
    int year = 5;

    public static void main(String[] args) {

        PMofINDIA obj = new PMofINDIA();
        System.out.println("Name = "+obj.name);
        System.out.println("Post = "+obj.post);
        System.out.println("Salary = "+obj.salary);
        System.out.println("PM of india have max. year to sit on PM's chair ="+obj.year);


        System.out.println("Name = "+obj.name+", Post = "+obj.post+", Salary = "+obj.salary+",PM of india have max. year to sit on PM's chair ="+obj.year);
    }
}
