package methods;

public class PercentageReturnType {

    public int percentage(int num) {

        int percent = 18;
        return percent;
    }


    public static void main(String[] args) {

        PercentageReturnType obj = new PercentageReturnType();

       double per =  obj.percentage(120*18/100);
        System.out.println("Percentage is :"+per);

    }
}
