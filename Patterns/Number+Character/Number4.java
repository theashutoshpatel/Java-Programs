public class Number4 {
  public static void main(String[] args) {
    int row = 4;
    int col = row;
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= col; j++) {
            if (i == 1 && j == 4) {
                System.out.print("* ");
            } else if (i == 3 && j == 3) {
                System.out.print("$ ");
            } else {
                System.out.print("a ");
            }
        }
        System.out.println();
    }
  }
}

// a a a * 
// a a a a
// a a $ a
// a a a a