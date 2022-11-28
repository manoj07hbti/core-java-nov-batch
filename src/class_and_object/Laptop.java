package class_and_object;

public class Laptop {

   // Properties or Data members  of laptop-----brand,ram(memory),operating system ,processor_frequency-------etc

           String brand = "HP";
           int ram = 8;
           String operating_system = "Windows";
           double processor_frequency = 2.60;


       // main method to run program

       public static void main(String[] args) {

        // to create an object of class(Laptop) using default constructor
        // Syntax : classname  object_name  =  new classname();

          Laptop laptop = new Laptop(); // laptop-----object have created

          // To print the values -----HP, 8, Windows ,2.60


           System.out.println("Laptop Brand is :"+laptop.brand);
           System.out.println("Laptop Ram is :"+laptop.ram);
           System.out.println("Laptop Operating System is :"+laptop.operating_system);
           System.out.println("Laptop Processor Frequency is :"+laptop.processor_frequency);



          // To print all the values in a single line
           System.out.println("Brand is:"+laptop.brand +  "Ram is :"+laptop.ram +  "Operating System is:"+laptop.operating_system +  "Processor is:"+laptop.processor_frequency);







       }








}
