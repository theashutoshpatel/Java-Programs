
// WAP TO CHECK WHETHER GIVEN NUMBER IS A SPY NUMBER OR NOT ?
import java.util.Scanner;

class SpyNumber {
    public static void spy(int n) {
        int pro = 1;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            pro *= r;
            sum += r;
            n /= 10;
        }
        if (pro == sum)
            System.out.println("Spy Number: " + sum);
        else
            System.out.println("Not a Spy Number: " + pro);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int n = sc.nextInt();

        spy(n);
        sc.close();
    }
}
