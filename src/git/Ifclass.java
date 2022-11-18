package git;

public class Ifclass {
    public static void main(String[] args) {
        String country="india";
        if(country=="india"){
            System.out.println("person belong to india....");
        }
        if(country!="india"){
            System.out.println("person belong to other country....");
        }
        country="paris";
        if(country!="paris"){
            System.out.println("person belong to other country");
        }
        int price=1200;
        if(price>1000){
            System.out.println("price is good..");
        }
        if(price<1000){
            System.out.println("price is bad...");
        }
        int marks=45;
        if(marks>60){
            System.out.println("first devision");
        }
        if(marks>50){
            System.out.println("second devision");
        }
        if(marks>33){
            System.out.println("third devision");
        }


    }
}




