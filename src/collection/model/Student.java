package collection.model;

import java.util.Objects;

public class Student {

    String name;
    int roll_no;
    String section;

    // parameterized constructor

    public Student(String name, int roll_no, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
    }

    // hashcode and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no &&
                name.equals(student.name) &&
                section.equals(student.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll_no, section);
    }


    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
