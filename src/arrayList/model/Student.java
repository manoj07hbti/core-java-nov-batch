package arrayList.model;

import java.util.Objects;

public class Student {

    String name;
    int rollNo;
    String section;

    // parameterize constructor


    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Hashcode or Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && name.equals(student.name) && section.equals(student.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, section);
    }


    // *****getter and setter*****

    // for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // for roll no
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    // for section
    public String getSection() {
        return section;
    }

    public void setSection (String section) {
        this.section = section;
    }
}
