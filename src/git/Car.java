package git;

public class Car {
    String company;
    int average;
    String name;

    public Car(String company, int average, String name) {
        this.company = company;
        this.average = average;
        this.name = name;
    }

    public static void main(String[] args) {
        Car obj=new Car("mahindra",12,"scorpio");
        System.out.println("company name: "+obj.company +" average :"+obj.average +" name: "+obj.name);

        Car obj2=new Car("maruti",22,"maruti 800");
        System.out.println("company name: "+obj2.company +" average :"+obj2.average +" name: "+obj2.name);

        Car obj3=new Car("tata",18,"safari");
        System.out.println("company name: "+obj3.company +" average :"+obj3.average +" name: "+obj3.name);
    }
}
