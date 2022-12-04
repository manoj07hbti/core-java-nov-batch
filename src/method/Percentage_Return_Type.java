package method;

public class Percentage_Return_Type {

    public int percentage(int num) {

        int percent = 35;
        return percent;
    }


    public static void main(String[] args) {

        Percentage_Return_Type obj = new Percentage_Return_Type ();

        double per =  obj.percentage(200*35/100);

        System.out.println("The percentage is :"+per);

    }
}




