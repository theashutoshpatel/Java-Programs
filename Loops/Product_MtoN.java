//WAP TO PRINT PRODUCT OF THE NATURAL NUMBERS BETWEEN M AND N ?
import java.util.Scanner;
class Product_MtoN {
    public static void product(int n,int m){
        int p=1;
        for(int i=n;i<=m;i++){
            p*=i; 
        }
        System.out.println(n+" to "+m+" = "+p);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value N: ");
        int n=sc.nextInt();

        System.out.print("Enter a value M: ");
        int m=sc.nextInt();
        if(n>m)
            System.out.println("Invalid range!!!");
        else
            product(n, m);
        sc.close();

    }    
}
