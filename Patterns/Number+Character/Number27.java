class Number27 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        char ch = 'a';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i - j >= row - col) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// a
// b c
// d e f
// g h i j