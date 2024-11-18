// WAP TO PRINT THE PRODUCT OF THE NUMBER ?

import java.util.Scanner;
class Product_number {
    public static void product(int a){
        int pro=1;
        while(a!=0){
            int r=a%10;
            pro*=r;
            a/=10;
        }
        System.out.println("Product of the number:" +pro);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int a = sc.nextInt();

        product(a);
        sc.close();
    }
}
