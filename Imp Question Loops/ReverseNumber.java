// WAP TO REVERSING A NUMBER ?
import java.util.Scanner;
class ReverseNumber {
    @SuppressWarnings("resource") // sc warning 
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        while(n!=0){
            int r=n%10;
            n/=10;
            System.out.print(r);
        }
    }
}
