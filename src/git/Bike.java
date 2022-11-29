package git;

public class Bike {
    String company;
    String name;
    int avrage;

    public Bike(String company, String name, int avrage) {
        this.company = company;
        this.name = name;
        this.avrage = avrage;
    }

    public static void main(String[] args) {
         Bike obj=new Bike("tvs","apache 180",35);
        System.out.println("comapny: "+obj.company+" name: "+obj.name +" average: "+obj.avrage);

        Bike obj2=new Bike("bajaj","pulsor",34);
        System.out.println("company name: "+obj2.company +" average :"+obj2.avrage +" name: "+obj2.name);

        Bike obj3=new Bike("royal enfield","standard",30);
        System.out.println("company name: "+obj3.company +" average :"+obj3.avrage +" name: "+obj3.name);


    }
}
