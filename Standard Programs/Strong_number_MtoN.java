// WAP TO PRINT STRONG NUMBERS BETWEEN M AND N ?

import java.util.Scanner;
class Strong_number_MtoN {
    public static void strong(int n) {
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int r = n % 10;
            int pro = 1;
            for (int i = 1; i <= r; i++) {
                pro *= i;
            }
            sum += pro;
            n /= 10;
        }
        if (sum == temp)
            System.out.println("Strong Number: " + sum);
        // else
        //     System.out.println("Not a Strong number: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number m: ");
        int m = sc.nextInt();
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            strong(i);
        }
        sc.close();
    }
}
