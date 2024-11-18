class Number1 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 2 && j == 3) {
                    System.out.print("@");
                } else if (i == 3 && j == 2) {
                    System.out.print("$");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

// 1111
// 11@1
// 1$11
// 1111
