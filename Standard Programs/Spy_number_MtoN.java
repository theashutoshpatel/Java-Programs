// WAP TO PRINT SPY NUMBERS BEWEEN M AND N ?

import java.util.Scanner;
class Spy_number_MtoN {
    public static void spy(int n) {
        int pro = 1;
        int sum = 0;
        int temp=n;
        while (n != 0) {
            int r = n % 10;
            pro *= r;
            sum += r;
            n /= 10;
        }
        if (pro == sum)
            System.out.println("Spy Number: " + temp);
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number m: ");
        int m = sc.nextInt();

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        for(int i=m;i<=n;i++){
            spy(i);
        }
        
        sc.close();
    }
}
