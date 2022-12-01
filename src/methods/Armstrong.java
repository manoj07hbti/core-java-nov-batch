package methods;

public class Armstrong {
    // method for Armstrong Number

    public void armstrong(){
        int num = 543, real, remainder, result = 0;

        real = num;

        while (real != 0)
        {
            remainder = real % 10;
            result += Math.pow(remainder, 3); // result += represent result = result + Math.pow(remainder, 3)
            real /= 10;
        }

        if(result == num) {
            System.out.println(num + " is an Armstrong number.");
        }else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Armstrong num=new Armstrong();
        num.armstrong();
    }
}
