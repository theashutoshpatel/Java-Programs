// WAP TO PRINT FIBINOCII SERIES ?
public class Fibonaci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        int c = a + b;
        while (a <= n) {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;

        }
    }
}
