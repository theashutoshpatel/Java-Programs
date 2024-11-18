// WAP TO PRINT SUMMATION OF EVEN NUMBERS BETWEEN M AND N ?

import java.util.Scanner;

class Even_MtoN_Sum {
    public static void sum(int n,int m){
        int sum=0;
        for(int i=n;i<=m;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
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
            sum(n, m);
        sc.close();
    }
}
