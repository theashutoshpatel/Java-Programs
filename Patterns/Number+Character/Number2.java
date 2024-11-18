public class Number2 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 && j == 3 || i==4 && j==1) {
                    System.out.print("% ");
                } else {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }
}
// A A % A 
// A A A A 
// A A A A 
// % A A A