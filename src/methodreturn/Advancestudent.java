package methodreturn;

import model.Student;

import java.util.HashMap;

public class Advancestudent {
    public void studentmap(){

        HashMap<String, Student>student=new HashMap();

        Student student1=new Student("arun","commerce",27);
        Student student2=new Student("gaurang","commerce",27);
        Student student3=new Student("tanya","science",25);

        student.put("a",student1);
        student.put("b",student2);
        student.put("c",student3);

        for(String var: student.keySet()){
            System.out.println("print "+student.get(var).getName() + " secetion "+student.get(var).getSection() + " age "+student.get(var).getAge());
        }


    }

    public static void main(String[] args) {
        Advancestudent obj=new Advancestudent();
        obj.studentmap();
    }
}
