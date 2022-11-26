package conditional;

public class arrayassignment {
    public static void main(String[] args) {
        double marks[] = {25.3,30.5,58.6,98.5,45.75,82.25,95.235};
        System.out.println("printing of marks :" + marks[3]);
        //printing of all marks
        for(int i=0;i<marks.length;i++){
            System.out.println("printing of marks"+ i  + marks[i]);
        }
        for(double mark: marks){
            System.out.println("printing of marks" + mark);
        }




    }

}