package conditional;

public class array {
    public static void main(String[] args){
       String cities [] ={"delhi","agra","mumbai","kolkata","hyderabad","pune"};
        System.out.println("city index is" + cities[2]);
        //printing of all cities
        for(int i=0;i<cities.length;i++) {
            System.out.println("printing of cities in array"+ i + cities[i]);
        }
        // advance loop
        for( String city:cities){
            System.out.println("printing of city in advance loop" +  city);

        }

    }

}
