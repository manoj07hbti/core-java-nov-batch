package returntypemethod;

public class percentage {
    public double percentage(double num,double percent){
        double percentage =(double)(num*percent)/100;
        return percentage;
    }

    public static void main(String[] args) {
        percentage obj=new percentage();
        double percentage=obj.percentage(58746,54);
        System.out.println("percentage is : "+percentage);

    }


}
