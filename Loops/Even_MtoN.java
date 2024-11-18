// WAP TO EVEN NUMBERS BETWEEN M AND N ?

import java.util.Scanner;
class Even_MtoN {
    public static void even(int m, int n) {
        int c = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
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
            even(m, n);

        sc.close();

    }
}
