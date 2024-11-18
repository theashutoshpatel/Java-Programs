// WAP TO PRINT THE DIGITS IN VETICALY ?
// WAP TO PRINT THE DIGITS IN HORIZONTALY ?

import java.util.Scanner;

class VeticalyPrint {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;

        }
        while (rev != 0) {
            int r = rev % 10;
            rev /= 10;
            
            System.out.println(r); // Verticaly Print
            System.out.print(r); // Horizontaly Print
        }
    }
}
