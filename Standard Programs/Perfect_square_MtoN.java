// WAP TO PRINT PERFECT SQUARES BETWEEN M AND N ?

import java.util.Scanner;
class Perfect_square_MtoN {
    public static void perfectSquare(int n) {
        boolean isPerfect = false;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) {
                isPerfect = true;
                break;
            }
        }
        if (isPerfect)
            System.out.println("Perfect Square: " + n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number m: ");
        int m = sc.nextInt();
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            perfectSquare(i);
        }

        sc.close();
    }
}