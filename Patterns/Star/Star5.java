class Star5 {
    public static void main(String[] args) {
        int row = 4;
        int col = (row * 2);
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i - j >= row - row || i + j > col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// *             * 
// * *         * *
// * * *     * * *
// * * * * * * * *
