package collection.model;

import java.util.Objects;

public class Studentlist {



        String name ;
        int rollNo;
        String section;

        //EGUAL AND HASHSET


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studentlist that = (Studentlist) o;
        return rollNo == that.rollNo && Objects.equals(name, that.name) && Objects.equals(section, that.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, section);
    }

    public Studentlist(String name, int rollNo, String section) {
            this.name = name;
            this.rollNo = rollNo;
            this.section = section;
        }

        public String getName() {
            return name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public String getSection() {
            return section;
        }
    }

