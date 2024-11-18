// WAP TO PRINT THE SUMMATION OF THE NUMBER ?
import java.util.Scanner;
class Summation_number {
    public static void sum(int a){
        int sum=0;
        while(a!=0){
            int r=a%10;
            sum+=r;
            a/=10;
        }
        System.out.println("Summation of number:" +sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int a = sc.nextInt();

        sum(a);
        sc.close();
    }
}
