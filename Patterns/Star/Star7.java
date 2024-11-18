class Star7 {
    public static void main(String[] args) {
        int row = 4;
        int col = (row * 2)-1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i+j >= row+1 && j-i <= row-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }  
}
//       *       
//     * * *     
//   * * * * *   
// * * * * * * *