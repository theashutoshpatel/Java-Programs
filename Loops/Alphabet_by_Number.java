import java.util.Scanner;
// WAP TO PRINT THE ALPHABET BY READING NUMBER ?
// EX: I/P: 5 O/P: E
// I/P: 25 O/P: Y
class Alphabet_by_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 26: ");
        int num = sc.nextInt();

        if (num < 1 || num > 26) {
            System.out.println("Write a valid number!!");
        } else {
            char alphabet = (char) ('A' + num - 1);
            System.out.println(alphabet);

        }
        sc.close();
    }
}
