
import java.util.Scanner;

// Enter 3 numbers from the user & make a function to print their average.

class Q1 {
    public static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a: ");
        int a=scan.nextInt();

        System.out.print("Enter b: ");
        int b=scan.nextInt();

        System.out.print("Enter c: ");
        int c=scan.nextInt();

        System.out.println(avg(a,b,c));

        scan.close();
    }
}
