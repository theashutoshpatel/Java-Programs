
// WAP TO CHECK WHETHER SUMATION OF THE NUMBER IS EVEN OR ODD ?
import java.util.Scanner;

class Sum_Even_Odd {
    public static int sum(int n) {
        int c = 0;
        while (n != 0) {
            int r = n % 10;
            c += r;
            n /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = sum(n);
        if (result % 2 == 0)
            System.out.println("Even: " + result);
        else
            System.out.println("Odd: " + result);

        sc.close();
    }
}
