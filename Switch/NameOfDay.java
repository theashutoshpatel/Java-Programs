// WAP to print number of the day by reading the name of the day.
import java.util.Scanner;
class NameOfDay {
    @SuppressWarnings("resource") // sc Warning so written this line
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week day:");
        String c = sc.next();
        switch (c) {
            case "Sunday" -> System.out.println("1");  
            case "Monday" -> System.out.println("2"); 
            case "Tuesday" -> System.out.println("3"); 
            case "Wednesday" -> System.out.println("4"); 
            case "Thrusday" -> System.out.println("5"); 
            case "Friday" -> System.out.println("6"); 
            case "Saturday" -> System.out.println("7"); 
            default -> System.out.println("Not a Week day");
        }

    }
}
