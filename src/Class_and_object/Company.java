package Class_and_object;

public class Company {
    // data member or properties
    String name ="Microsoft";
    String country="America";
    String headquarter="Haidrabad";
    int year =1975;

    public static void main(String[] args) {
        // Syntax:class name obj name =new class  name ();
        Company obj = new Company();
        //object name .properties name
        System.out.println("Company is  "+ obj.name);
        System.out.println("Company is  fist time started  in " + obj.country);
        System.out.println("Company is  headquarter in " + obj. headquarter);
        System.out.println("Company is  start  in year " + obj.year);


    }

}
