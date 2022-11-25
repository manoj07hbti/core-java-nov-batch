package arrays;

public class Day14_ArraysForLoop {
                            /*    Array : to store group of similar data
                                  //SYNTAX   DataType varName []= {value1,value2,value3, value4....valueN };
                            */
      public static void main(String[] args) {

          String products[] = {"PEN", "REFILL", "BOOKS", "NOTEBOOKS", "MARKER", "HIGHLIGHTER", "DIARY", "PENCIL", "ERASER", "SHARPENER"};
          int prices[] = {10, 5, 50, 60, 15, 15, 80, 5, 5, 5};

          for(int i=0; i<products.length; i++){
              System.out.println("Stationary products "+i+ " - " +products[i]+" Rs. "+prices[i]);
          }

      }
}
