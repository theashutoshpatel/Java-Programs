//WAP TO PRINT TABLE WITHOUT USING MULTIPLICATION OPERATOR ?

import java.util.Scanner;
class WithoutMutiplication_table_print {
    public static void table(int n){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=0;
            for(int j=1;j<=i;j++){
                sum+=n;
            }
            System.out.println(n+" * "+i+" = "+ sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n=sc.nextInt();

        table(n);
        sc.close();
    }
}
