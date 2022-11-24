package loops;

public class do_while_table {
    public static void main(String[] args) {

        int i=1;
        int n=6;

        do {
            int table = n * i;
            System.out.println(n+"*"+i+"="+table);
            i++;
        } while (i<=10);
    }
}
