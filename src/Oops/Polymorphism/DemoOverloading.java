package Oops.Polymorphism;

public class DemoOverloading {

        // polymorphism is a greek word
        // Poly = many... morphism = forms...
        // polymorphism : Same operation applied with various data and gives different behavior
        // Method overloading : same method applying but different input parameters

        public void a1(){
            System.out.println("It ia a overloading method");

        }

        // it's data overloading again.....
        public void a1 (String name) {
            System.out.println("It ia a overloading method String:"+name);
        }
        // it's data overloading again by double variable
        public void a1(double price) {

            System.out.println("It ia a overloading  method double:"+ price);
        }

        // it's data overloading again by int variable
        public void a1 (int marks) {
            System.out.println("It ia a overloading  method  int:"+marks);
        }


        // it's data overloading again by boolean variable
        public void a1 (boolean variable){
            System.out.println("It ia a overloading method boolean: "+variable);

        }
        // it's data overloading again by float variable

        public void a1 (float floating){
            System.out.println("It ia a overloading method float: "+floating);

        }
        // it's data overloading again by char variable
        public void a1 (char character){
            System.out.println("It ia a overloading method boolean: "+character);

        }

        // it's data overloading again by long variable
        public void a1 (long data){
            System.out.println("It ia a overloading method boolean: "+data);

        }

        // it's data overloading again by short variable

        public void a1 (short digit) {
            System.out.println("It ia a overloading method boolean: " + digit);
        }

        // it's data overloading again by multiple variables

        public void a1 (String book,int salary){
            System.out.println("It ia a overloading method string & salary: "+ book + " "+ salary);

        }
        public static void main(String[] args) {
            DemoOverloading obj = new DemoOverloading();
            obj.a1();
            obj.a1(25.66);
            obj.a1("java");
            obj.a1(25555);
            obj.a1(true );
            obj.a1 ('a');
            obj.a1 (34734353553l);
            obj.a1(1245.32f);
            obj.a1();
            obj .a1("spiritual books" , 155500);

        }
    }


