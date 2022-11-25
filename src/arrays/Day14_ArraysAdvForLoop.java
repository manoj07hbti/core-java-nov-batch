package arrays;

public class Day14_ArraysAdvForLoop {
    /*    Array : to store group of similar data
          //SYNTAX   DataType varName []= {value1,value2,value3, value4....valueN };
    */
    public static void main(String[] args) {

        String products[] = {"PEN", "REFILL", "BOOKS", "NOTEBOOKS", "MARKER", "HIGHLIGHTER", "DIARY", "PENCIL", "ERASER", "SHARPENER"};
        int prices[] = {10, 5, 50, 60, 15, 15, 80, 5, 5, 5};


        // ADVANCED FOR LOOP     for (DATATYPE VarName : arrayName) { CODE }
        for(String prod : products ) {

            System.out.println("Stationary products  - " + prod);
        }
        for(int price : prices ) {

            System.out.println("Stationary products  Rs. " + price);
        }

    }
}
