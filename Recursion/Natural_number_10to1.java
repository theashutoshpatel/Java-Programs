// WAP TO PRINT 10 T0 1 NATURAL NUMBERS ?
import java.util.Scanner;
public class Natural_number_10to1 {
        public static void naturalNumber(int a,int b){
        if(a>=b){
            System.out.println(a);
            naturalNumber(a-1, b);
        }
            
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();

        System.out.print("Enter a number: ");
        int b=sc.nextInt();

        naturalNumber(a, b);
    }
}
