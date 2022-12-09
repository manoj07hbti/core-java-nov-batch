package array;

public class SumOfArray {
    public static void main(String[]args){
    double [] arr = new double [] {12.90,23.76,44,236.986,987,};
    double sum = 0;
    //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
        System.out.println("Sum of all the elements of an array: " + sum);
}
}


