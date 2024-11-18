
// WAP TO PRINT NUMBERS BETWEEN M AND N EXCEPT THE NUMBER WHICH HAS 7 IN IT ?
import java.util.Scanner;

class Print_Except7 {
    public static boolean contain7(int k) {
        while (k != 0) {
            int r = k % 10;
            if (r == 7)
                return true;
            k /= 10;
        }
        return false;
    }

    public static void check(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (!contain7(i))
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        System.out.print("Enter a number M: ");
        int m = sc.nextInt();

        // int result=check(n, m);
        check(n, m);
        sc.close();
    }
}
