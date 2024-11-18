
// WAP TO PRINT SUMMATION OF THE NUMBERS WHICH ARE DIVISABLE BY 5 BETWEEN M AND N ?
import java.util.Scanner;

class Divisible_by5_sum {
    public static void divisibleOf5(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (i % 5 == 0)
                sum += i;
        }
        System.out.println("Sumation of number divisible by 5: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N:");
        int n = sc.nextInt();
        System.out.print("Enter a number M:");
        int m = sc.nextInt();

        if (n > m)
            System.out.println("Invalid range!!!");
        else
            divisibleOf5(n, m);

        sc.close();

    }
}
