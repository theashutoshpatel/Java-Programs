// WAP TO PRINT TABLE BY READING USER INPUT ?

import java.util.*;
class Multiplication_Table_Input {
    public static void table(int n){
        System.out.println("Multiplication of Table "+n+":");
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+ (n*i));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n=sc.nextInt();

        table(n);
        sc.close();

    }
}
