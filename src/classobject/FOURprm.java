package classobject;

public class FOURprm {

    String name;
    int model;
    String owner;
    double price;

    public FOURprm(String name, int model, String owner, double price) {
        this.name = name;
        this.model = model;
        this.owner = owner;
        this.price = price;
    }

    public static void main(String[]args){

        FOURprm obj=new FOURprm("Hundai",2012,"Ramesh",1230000.847);

        System.out.println("Model:"+obj.name+"   Model:"+obj.model+"  Owner:"+obj.owner+"  Price:"+obj.price);

        FOURprm obj2=new FOURprm("Honda",2015,"Suresh",1210000.970);

        System.out.println("Model:"+obj2.name+"  Model:"+obj2.model+"   Owner:"+obj2.owner+"   Price:"+obj2.price);


        FOURprm obj3=new FOURprm("Renoult",2017,"Mukesh",830000.847);

        System.out.println("Model:"+obj3.name+"   Model:"+obj3.model+"   Owner:"+obj3.owner+"  Price:"+obj3.price);


    }
}
