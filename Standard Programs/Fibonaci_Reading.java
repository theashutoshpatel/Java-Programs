// 18)WAP TO PRINT FIBINOCII SERIES BY READING THE VALUE ?
import java.util.Scanner;
class Fibonaci_Reading {
    public static void fibo(int n){
        int a=0,b=1,c=a+b;
        // if (n >= 0) {
        //     System.out.println(a);  // Print 0 as the first Fibonacci number
        // }
        // if (n >= 1) {
        //     System.out.println(b);  // Print 1 as the second Fibonacci number
        // }
        while(a<=n){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        fibo(n);
    }
}
