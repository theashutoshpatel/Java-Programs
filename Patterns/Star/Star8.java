class Star8 {
    public static void main(String[] args) {
        int row = 8;
        int col = (row * 2)-1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j-i >= row-row && i+j <= col+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }  
}