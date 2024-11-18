// Check Palindrome or not 
import java.util.Scanner;

class Palindrome {
    public static void palindrom(int n) {
        int rev = 0;
        int temp = n;
        while (n != 0) {
            int r = n % 10; // find the last digit
            rev = rev * 10 + r; // store the last digit and reverse it
            n = n / 10; // remove the digit
        }
        if (temp == rev) { // check condition equal number or not
            System.out.println("Palindrom Number");
        } else {
            System.out.println("Not Palindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:"); // user input
        int n = sc.nextInt();
        palindrom(n); // Palindrome function call
        sc.close();

    }
}
