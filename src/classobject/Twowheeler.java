package classobject;

public class Twowheeler {

    String name;
    int model;
    String owner;
    double price;

    public Twowheeler(String name, int model, String owner, double price) {
        this.name = name;
        this.model = model;
        this.owner = owner;
        this.price = price;
    }



    public static void main(String[]args){

        Twowheeler obj=new Twowheeler("Bullet",2022,"Ramesh",180000.847);

        System.out.println("Model:"+obj.name+"   Model:"+obj.model+"  Owner:"+obj.owner+"  Price:"+obj.price);

        Twowheeler obj2=new Twowheeler("Java",2022,"Raju",230000.847);

        System.out.println("Model:"+obj2.name+"   Model:"+obj2.model+"  Owner:"+obj2.owner+"  Price:"+obj2.price);

        Twowheeler obj3=new Twowheeler("Honda CBZ",2019,"Pawan",930000.847);

        System.out.println("Model:"+obj3.name+"   Model:"+obj3.model+"  Owner:"+obj3.owner+"  Price:"+obj3.price);






    }
}
