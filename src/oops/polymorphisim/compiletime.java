package oops.polymorphisim;

public class compiletime {

    public void c1 (){

        System.out.println("THIS IS A EMPTY METHOD  ");
    }
    //over loading
    public void c1 (int age){

        System.out.println("THIS IS A METHOD OF "+age);
    }
    //again overloading
    public void c1 (String name){

        System.out.println("THIS IS A METHOD OF "+name);
    }
    //again overloading
    public void c1 (float value){

        System.out.println("THIS IS A METHOD OF "+value);
    }
    //again overloading
    public void c1 (double price){

        System.out.println("THIS IS A METHOD OF "+price);
    }
    //Multi overloading
    public void c1 (boolean ans, String name){

        System.out.println("THIS IS A METHOD OF "+ans+ " " +name);
    }

    public static void main(String[] args) {
        compiletime obj = new compiletime();
        obj.c1();
        obj.c1(22);
        obj.c1(22.3F);
        obj.c1("Sandeep");
        obj.c1(55.44);
        obj.c1(true,"Sandeep");
    }
}
