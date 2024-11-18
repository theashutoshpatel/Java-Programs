import java.util.Scanner;

class PerfectNumber {
    public static int perfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();


        if (n == perfect(n))
            System.out.println(n + " Perfect number");
        else
            System.out.println(n + " Not a perfect number");
        sc.close();
    }
}