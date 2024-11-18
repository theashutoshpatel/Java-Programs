// WAP TO CHECK WHETHER PRODUCT OF THE NUMBER IS EVEN OR ODD ?
import java.util.Scanner;
class Product_Even_Odd{
    public static long product(long n){
        int pro=1;
        while (n != 0) {
            long digit = n % 10;
            pro *= digit;
            n /= 10;
        }
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n=sc.nextLong();
        long result=product(n);

        if(result % 2==0)
            System.out.println("Even: "+result);
        else
            System.out.println("Odd: "+result);

        sc.close();
    }
}