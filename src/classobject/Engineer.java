package classobject;

public class Engineer {

    String branch;
    String roll;
    int year;
    double salary;

    public Engineer(String branch, String roll, int year, double salary) {
        this.branch = branch;
        this.roll = roll;
        this.year = year;
        this.salary = salary;
    }

    public static void main(String[]args){

        Engineer obj=new Engineer("Civil","14erecve078",2022,1909.009);


        System.out.println("Branch="+obj.branch+"  roll number="+obj.roll+"  passout year="+obj.year+"   salary="+obj.salary);

        Engineer obj2=new Engineer("Computer science","14erecse078",2021,10000.009);


        System.out.println("Branch="+obj2.branch+"  roll number="+obj2.roll+"  passout year="+obj2.year+"   salary="+obj2.salary);


        Engineer obj3=new Engineer("Electrical","14ereee078",2021,13000.009);


        System.out.println("Branch="+obj3.branch+"  roll number="+obj3.roll+"  passout year="+obj3.year+"   salary="+obj3.salary);




    }


}
