class Number9 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i==2 && j==2 || i==2 && j==4 || i==3 && j==2 || i==3 && j==4) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

// * * * * 
// *   *   
// *   *   
// * * * * 
