// Check weather working day or not
import java.util.Scanner;
class WorkingDay {
    @SuppressWarnings("resource") // sc warning that's why written this line
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number between 1 to 7:");
        int day=sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Sunday is not a working Day" );
            case 2 -> System.out.println("Monday is working Day" );
            case 3 -> System.out.println("Tuesday is not a working Day" );
            case 4 -> System.out.println("Wednesday is working Day" );
            case 5 -> System.out.println("Thrusday is working Day" );
            case 6 -> System.out.println("Friday is working Day" );
            case 7 -> System.out.println("Saturday is working Day" );
            default -> System.out.println("Not a Week day");
        }
    }
}
