// WAP TO FIND OUT FACTORIAL WITH THE HELP OF RECURSION ?

import java.util.Scanner;

class Factorial {
    public static int fact(int n) {
        if(n>=1){
            return n * fact(n-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(fact(n));
    }
}
