// WAP TO PRINT HOW MANY NUMBERS HAVE 6 IN IT AND HOW MANY 6'S ARE PRESENT ?

import java.util.Scanner;
class Six_in_number {
    public static int countSix(int k) {
        int c = 0;
        while (k != 0) {
            int r = k % 10;
            if (r == 6)
                c++;
            k /= 10;
        }
        return c;
    }

    public static void check(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (countSix(i) > 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        System.out.print("Enter a number m: ");
        int m = sc.nextInt();

        check(n, m);
        sc.close();
    }
}
