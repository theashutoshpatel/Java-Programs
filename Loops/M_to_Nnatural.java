// WAP TO PRINT NATURAL B/W M AND N ?

import java.util.Scanner;

class M_to_Nnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        System.out.print("Enter a number m: ");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
