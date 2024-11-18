
// WAP TO PRINT PRODUCT OF EVEN NUMBRS BETWEEN M AND N ?
import java.util.*;
class Product_Odd_number {
    public static void odd(int m, int n) {
        int product = 1;
        boolean hasodd=false;
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                product *= i;
                hasodd=true;
            }
        }
        if (!hasodd) {
            System.out.println("No odd numbers in this range.");
        } else {
            System.out.println("Product of odd numbers between " + m + " and " + n + " is: " + product);
        }
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
