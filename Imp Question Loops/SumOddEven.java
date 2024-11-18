
import java.util.Scanner;

class SumOddEven {
    static int sum=0;
    public static void sum(int n){
        while(n!=0){
            int r=n % 10; // last digit find of number
            sum+=r;
            n/=10;
        }
        if(sum % 2 ==0){ // Check even or odd number
            System.out.println("Even Number: "+sum);
        }
        else{
            System.out.println("Odd Number: "+sum);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Entere a number: "); // User input
        int n=sc.nextInt();

        sum(n); // function call
        sc.close();

    }    
}