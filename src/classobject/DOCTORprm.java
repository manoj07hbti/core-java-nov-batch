package classobject;

public class DOCTORprm {

    String name;
    String specialist;
    int time;
    double fees;


    public DOCTORprm(String name, String specialist, int time, double fees) {
        this.name = name;
        this.specialist = specialist;
        this.time = time;
        this.fees = fees;
    }

        public static void main (String[]args){

            DOCTORprm list = new DOCTORprm("Sanjay Verma", "Fever", 3 - 6, 150);

            System.out.println("Name:" + list.name + "  Specialist:" + list.specialist + "  Time:" + list.time + "  fees" + list.fees);

            DOCTORprm list2 = new DOCTORprm("Sudha Bansal", "Dengu", 3 - 9, 250);

            System.out.println("Name:" + list2.name + "  Specialist:" + list2.specialist + "  Time:" + list2.time + "  fees" + list2.fees);


            DOCTORprm list3 = new DOCTORprm("O P sharma", "surgery", 3 - 9, 350);

            System.out.println("Name:" + list3.name + "  Specialist:" + list3.specialist + "  Time:" + list3.time + "  fees" + list3.fees);


            DOCTORprm list4 = new DOCTORprm("Manik Jain", "Jondis", 3 - 8, 150);

            System.out.println("Name:" + list4.name + "  Specialist:" + list4.specialist + "  Time:" + list4.time + "  fees" + list4.fees);



        }
}
