
// WAP TO PRINT PRODUCT OF ODD NUMBRS BETWEEN M AND N ?
import java.util.Scanner;

class Odd_MtoN_Sum {
    public static void odd(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number M: ");
        int m = sc.nextInt();

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        if (m > n)
            System.out.println("Invalid range!!");
        else
            odd(m, n);
        sc.close();
    }
}