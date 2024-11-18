public class Number10 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        char ch = 'a';

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == j || i + j == col + 1) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
