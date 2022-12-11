package collection.model;

public class Studentlist {



        String name ;
        int rollNo;
        String section;

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

