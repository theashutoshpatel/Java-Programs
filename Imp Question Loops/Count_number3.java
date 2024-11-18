
// WAP TO COUNT HOW MANY 3 ARE PRESENT IN BETWEN M AND N ?
import java.util.Scanner;

class Count_number3 {
    public static int count3(int a) {
        int c = 0;
        while (a != 0) {
            int r = a % 10;
            if (r == 3)
                c++;
            a /= 10;
        }
        return c;
    }

    public static void check(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            count += count3(i);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        System.out.print("Enter a number M:");
        int m = sc.nextInt();
        check(n, m);
        sc.close();
    }
}

