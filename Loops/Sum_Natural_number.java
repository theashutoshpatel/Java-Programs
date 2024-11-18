
// WAP TO PRINT SUMMATION OF THE NATURAL NUMBERS BETWEEN M AND N ?
import java.util.Scanner;
class Sum_Natural_number {
    public static void sumOfnatural(int m,int n){
        int sum=0;
        for(int i=m;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number M: ");
        int m=sc.nextInt();

        System.out.print("Enter a number N: ");
        int n=sc.nextInt();

        if(m>n)
            System.out.println("Invalid range!!");
        else
            sumOfnatural(m, n);
        sc.close();

    }
}
