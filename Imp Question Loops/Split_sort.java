
/*
   n= 5281 
   count the digit in n.
   it's even 4 , so devide the n two part
   52+81= 133

   It's even then sort the n .
   1258
 */
import java.util.Scanner;

class Number_Sort {

    public static void sort(int n) {
        int res = 0;
        for (int i = 1; i <= 9; i++) {
            int k = n;
            while (k != 0) {
                int r = k % 10;
                if (r == i)
                    res = res * 10 + r;
                k /= 10;
            }
        }
        System.out.println("sort : " + res);

    }

    public static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;

        }
        return c;
    }

    public static void split(int n, int c) {
        int s = 0, p = 1;
        for (int i = 1; i <= c / 2; i++) {
            int r = n % 10;
            s = r * p + s;
            p *= 10;
            n /= 10;
        }
        System.out.println(n + " + " + s);
        System.out.println("sum of split digits : " + (n + s));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = count(n);
        if (c % 2 == 0)
            split(n, c);
        else
            sort(n);

        sc.close();
    }

}