class Number19 {
    public static void main(String[] args) {
        int row = 4;
        int num = 1;
        char ch = 'a';
        for (int i = 1; i <= row; i++) {
            if (i % 2 != 0) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print(num++ + " ");

                }
            } else {
                for (char j = 1; j <= 4; j++) {
                    System.out.print(ch++ + " ");
                }
            }
            System.out.println();
        }

    }
}
// 1 2 3 4
// a b c d
// 5 6 7 8
// e f g h