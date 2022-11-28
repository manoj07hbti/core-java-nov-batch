package classobject;

public class Engineer {

    String branch= "mechanical";
    String roll= "14ereme073";
    int year=2019;
    double salary=000.786;

    public static void main(String[]args){

        Engineer obj=new Engineer();

        System.out.println("The branch of the candidate is"+obj.branch);
        System.out.println("The roll number of the candidate is"+obj.roll);
        System.out.println("The pass out year of candidate is"+obj.year);
        System.out.println("The salary of the candidate is"+obj.salary);


        System.out.println("Branch="+obj.branch+"  roll number="+obj.roll+"  passout year="+obj.year+"   salary="+obj.salary);
    }


}
