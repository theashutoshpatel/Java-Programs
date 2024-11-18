public class Number24 {
    public static void main(String[] args) {
        
        // First row: Numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Second row: Letters a to e
        char ch = 'a';
        for (int i = 1; i <= 5; i++) {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
        
        // Third row: Plus signs
        for (int i = 1; i <= 5; i++) {
            System.out.print("+ ");
        }
        System.out.println();
        
        // Fourth row: Letters a to e again
        ch = 'a';
        for (int i = 1; i <= 5; i++) {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
        
        // Fifth row: Numbers 1 to 5 again
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}
// 1 2 3 4 5 
// a b c d e 
// + + + + + 
// a b c d e 
// 1 2 3 4 5 