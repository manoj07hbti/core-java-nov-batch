package nested;

public class Nested_if {
    public static void main(String[] args) {
int marks = 34 ;
if (marks>33) {
    System.out.println("the student is passed");
}
else {
    System.out.println("Failed");
}
String section = "science" ;
if (marks>33 & section == "science") {
    System.out.println("The student have science section and is also passed");
}
else {
    System.out.println("the student do not have science");

}

    }
}
