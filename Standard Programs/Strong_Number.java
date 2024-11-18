// WAP TO CHECK WHETHER GIVEN NUMBER IS STRONG NUMBER OR NOT ?
import java.util.*;

class Strong_Number {
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
        else
            System.out.println("Not a Strong number: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int n = sc.nextInt();
        strong(n);
    }
}
