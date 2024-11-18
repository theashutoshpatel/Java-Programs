
// WAP TO COUNT THE NUMBERS WHICCH ARE DIVISABLE BY 7 BETWEEN M AN N ?
import java.util.Scanner;

class Divisible_by7_MtoN {
    public static void divisible(int m, int n) {
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (i % 7 == 0)
                count++;
        }
        System.out.println("This many number divisible by 7: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number M: ");
        int m = sc.nextInt();

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();
        if (m > n)
            System.out.println("Invalid range!!!");
        else
            divisible(m, n);
        sc.close();
    }

}
