public class Number26 {
    public static void main(String[] args) {
        int number = 1;
        char letter = 'A';

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                System.out.println("# # # # #");
            } else {

                System.out.print(number + " ");
                number++;
                System.out.print(letter + " ");
                letter++;
                System.out.print("# ");
                System.out.print(letter + " ");
                letter++;
                System.out.print(number + " ");
                number++;
                System.out.println();
            }
        }
    }
}
// 1 A # B 2 
// 3 C # D 4 
// # # # # # 
// 5 E # F 6 
// 7 G # H 8 