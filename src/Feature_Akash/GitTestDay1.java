package Feature_Akash;

public class GitTestDay1 {
    public static void main(String[] args) {
        //Lenovo Laptop Specs input
        String model = "Lenovo ThinkPad";
        String res = "2048x1080";
        String pro = "Core i9 12th Gen";
        String graphics = "RTX 3070 12GB";
        int ram = 32;
        int ssd1 = 512;
        int ssd2 = 2;
        int win = 10;
        double display = 14.00;
        double weight = 1.26;
        double a = 3;
        double b = 2;
        double c = a / b;

        //Specs Output
        System.out.println("Laptop Model - " + model);
        System.out.println("Display Size - " + display + " inch");
        System.out.println("Resolution - " + res + " Pixels");
        System.out.println("Processor - Intel® " + pro);
        System.out.println("RAM - Kingston Fury " + ram + " GB 3600Mhz x1 ");
        System.out.println("GPU - Geforce " + graphics);
        System.out.println("Primary SSD - " + ssd1 + "GB");
        System.out.println("Secondary SSD - " + ssd2 + "TB");
        System.out.println("Operating OS - Windows " + win);
        System.out.println("Weight - " + weight + " KG");
        System.out.println(c);
    }
}
