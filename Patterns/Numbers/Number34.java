class Number34 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;
        for (int i = 1; i <= row; i++) {
            char c='e';
            for (int j = 1; j <= col; j++) {
                if (i - j >= row - col) {
                    System.out.print(c+" ");
                    c--;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
