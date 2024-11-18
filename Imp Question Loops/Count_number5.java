// WAP TO COUNT NUMBERS BETWEEN M AND N THE NUMBER WHICH HAS 5 IN IT ?

import java.util.Scanner;
class Count_number5 {

    public static int find5(int p) {
        int count = 0;
        while (p != 0) {
            int r = p % 10;
            if (r == 5)
                count++;
            p /= 10;
        }
        return count;
    }

    public static void Check(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (find5(i) > 0)
                sum++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        System.out.print("Enter a number M:");
        int m = sc.nextInt();

        Check(n, m);
        sc.close();

    }
}
