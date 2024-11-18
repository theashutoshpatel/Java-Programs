class Star9 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i+j >= row-1 && j-i<= row/2 && i<=(row/2)+1 || i-j<=(row/2) && i+j<=(row*2)-2 && i>=(row/2)+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}