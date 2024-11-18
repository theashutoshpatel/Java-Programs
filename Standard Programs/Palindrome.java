
// WAP TO CHECK WHETHER GIVEN NUMBER IS PALINDROME OR NOT ?
import java.util.Scanner;

class Palindrome {
    public static void palindrome(int n) {
        int rev = 0, temp = n;
        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        if (temp == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("not a palindrome number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n<=0)
            System.out.println("invalid number");
        else
            palindrome(n);
        sc.close();
        
    }
}
