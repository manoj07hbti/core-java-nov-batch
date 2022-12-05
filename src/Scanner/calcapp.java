package Scanner;

 import java.util.Scanner;

  public class calcapp {
      public int addition(int a, int b) {
          int sum = a + b;
          return sum;
      }

      public int subtraction(int a, int b) {

          int sub = a-b;

          return sub;
      }

      public int multiple(int a, int b) {

          int multi = a*b;

          return multi;
      }

      public int division(int a, int b) {

          int divi = a / b;

          return divi;
      }

      public static void main(String[] args) {
          Scanner Scanner = new Scanner(System.in);
          System.out.println("Please enter of value :a");
          int a= Scanner.nextInt();


          System.out.println("Please enter of value :b");
          int b = Scanner.nextInt();




          System.out.println("Please enter Choice: 1 for addition, 2 for subtraction, 3 for multiplication and  Divide");
          int choice = Scanner.nextInt();

          calcapp obj = new calcapp();
          int sum,sub,multi,divi = 0;

          if (choice == 1) {
              sum = obj.addition(a, b);
              System.out.println("SUM is: " + sum);
          }
          if (choice == 2) {
              sum = obj.addition(a, b);
              System.out.println("SUM is: " + sum);
          }
          else if (choice == 3) {

                  sub = obj.subtraction(a,b);
                  System.out.println("SUB is : " + sub);
              }else if (choice == 4) {

              multi = obj.multiple(a,b);
              System.out.println("SUB is : " + multi);
          }
          }


      }







