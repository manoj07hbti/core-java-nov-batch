package methods;

public class PercentageReturnType {
    public double percentage(int a, double r){
        double per = (a*r)/100;
        return per;
    }

    public static void main(String[] args) {
        PercentageReturnType obj = new PercentageReturnType();
        double per = obj.percentage(123,22.3);
        System.out.println("Percentage of number is : "+per);

    }
}
