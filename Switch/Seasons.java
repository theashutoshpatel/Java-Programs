
import java.util.Scanner;
// WAP t print seasons name based on month name.
class Seasons {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number 1 to 12: ");
        int season=sc.nextInt(); // take input

        switch(season){
            case 12,1,2 -> System.out.println("WINTER"); // All the seasons 
            case 3,4,5 -> System.out.println("SUMMER");
            case 6,7,8 -> System.out.println("RAINY");
            case 9,10,11 -> System.out.println("SPRING");
            default -> System.out.println("Not a Season");
        }
    }
    
}
