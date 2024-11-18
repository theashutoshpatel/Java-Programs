// WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT NUMBER OR NOT ?
import java.util.Scanner;
class PerfectNumber {
    public static void perfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.println("perfect number: "+sum);
        else
            System.out.println("Not a perfect Number: "+sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        perfect(n);
        sc.close();
    }
}