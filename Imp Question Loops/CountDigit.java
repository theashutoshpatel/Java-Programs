// WAP TO COUNT DIGITS PRESENT IN A NUMBER ?
import java.util.Scanner;
class CountDigit {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entere a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum++;
            n /= 10; // to remove the digit in a number
        }
        System.out.println("Total Digit in number:"+sum);
    }
}
