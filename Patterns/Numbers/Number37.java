public class Number37 {

        public static void main(String[] args) {
    
            for (int i = 1; i <= 7; i++) {
                char c='A';
                for (int j = 1; j <= 7; j++) {
                    if (i + j >= 5 && j - i <= 3 && i <= 4 || i - j <= 3 && i + j <= 11 && i >= 4) {
                        System.out.print(c+" ");
                        c++;
                    } else {
                        System.out.print("  ");
                    }
    
    
                }
                System.out.println();
            }
        }
    
}
//      A       
//    A B C
//   A B C D E
// A B C D E F G
//   A B C D E
//    A B C
//      A