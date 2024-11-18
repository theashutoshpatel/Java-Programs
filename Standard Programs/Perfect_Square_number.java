
// WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT SQUARE OR NOT ? // 25 * 25 = 625
import java.util.Scanner;

class Perfect_Square_number {
    public static void perfectSquare(int n) {
        boolean isPerfect = false;
        for(int i=1;i<=n/2;i++) {
            if (i * i == n) {
                isPerfect = true;
                break;
            }
        }
        if (isPerfect) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        perfectSquare(n);
        sc.close();

    }
}
