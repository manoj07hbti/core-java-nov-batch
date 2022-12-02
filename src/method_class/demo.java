package method_class;

public class demo {
    public void oddevenmethod() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("number is even: " + i);

            } else {
                System.out.println("number is odd:" + i);
            }

        }

    }
    public void calculatepersentage(){
        int num=1265;
        int percentage=23;
        double result=(double)(num*percentage)/100;
        System.out.println("23 percentage of 1265 is "+result);

    }

    public static void main(String[] args) {
        demo obj=new demo();
        obj.oddevenmethod();
        obj.calculatepersentage();
    }
}
