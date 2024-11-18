// WAP TO SWAP TWO VARIABLES WITHOUT USING THIRD VARIABLE ?
import java.util.Scanner;
class Swap_variable_thirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int a = sc.nextInt();

        System.out.print("Enter a number b: ");
        int b = sc.nextInt();
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Print a value: "+a);
        System.out.println("Print b value: "+b);

        

    }
}