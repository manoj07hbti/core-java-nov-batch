package switchstatement;

public class SwitchStatement {
    /*switch(expression){
                case 1: code
                        break;
                case 2:code
                        break;
                default: code
                }
     */
    public static void main(String[] args) {

        //WAP to print months in sequence.
        int month = 11;
        switch (month){
            case 1 : System.out.println("This Month Is JANUARY");
                        break;
            case 2 : System.out.println("This Month Is FEBRUARY");
                break;
            case 3 : System.out.println("This Month Is MARCH");
                break;
            case 4 : System.out.println("This Month Is APRIL");
                break;
            case 5 : System.out.println("This Month Is MAY");
                break;
            case 6 : System.out.println("This Month Is JUNE");
                break;
            case 7 : System.out.println("This Month Is JULY");
                break;
            case 8 : System.out.println("This Month Is AUGUST");
                break;
            case 9 : System.out.println("This Month Is SEPTEMBER");
                break;
            case 10 : System.out.println("This Month Is OCTOBER");
                break;
            case 11 : System.out.println("This Month Is NOVEMBER");
                break;
            case 12 : System.out.println("This Month Is DECEMBER");
                break;

            default:System.out.println("INVALID MONTH ENTERED");

        }



    }
}
