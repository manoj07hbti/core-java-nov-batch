package functions_methods;

public class percentageR {

    public double percent(int a, int b){
        double percent = ( double ) a*b/100;
        return percent;
    }

    public static void main(String[] args) {
        percentageR obj = new percentageR();
        double percent = obj.percent(17,250);
        System.out.println("Percentage of numbers is "+percent);
    }
}
