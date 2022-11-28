package class_and_object;

public class Songs {
    String genre = "Folk Song";
    String Name = "Pasoori";
    double length = 4.36;

    public static void main(String[] args) {
        Songs desc = new Songs();
        System.out.println("Song Name - "+desc.Name+ ", Song length - "+desc.length+"M, Genre - "+desc.genre);
    }
}
