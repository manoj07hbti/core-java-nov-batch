package methodreturn;

import model.Student;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Studenthashset {
    public HashSet<Student> studenthashset(){
      LinkedHashSet<Student> studenthashset=new LinkedHashSet();
        Student student1=new Student("arun","commerce",27);
        Student student2=new Student("gaurang","commerce",27);
        Student student3=new Student("tanya","science",25);
        studenthashset.add(student1);
        studenthashset.add(student2);
        studenthashset.add(student3);
        return studenthashset;
    }

    public static void main(String[] args) {
        Studenthashset obj=new Studenthashset();
        HashSet<Student>studenthashset =obj.studenthashset();
        for(Student var:studenthashset){
            System.out.println("print student list "+var.getName() + "section "+var.getSection() + "age "+var.getAge());
        }
    }
}
