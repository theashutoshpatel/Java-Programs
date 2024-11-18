
// WAP TO PRINT PRIME NUMBERS BEETWEEN M AND N ?
import java.util.Scanner;

class Prime_number_MtoN {
    public static void prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2)
            System.out.println("Prime number: " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number m: ");
        int m = sc.nextInt();
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            prime(i);
        }
        sc.close();
    }
}
