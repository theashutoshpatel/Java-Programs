public class Star6 {
    public static void main(String[] args) {
        int row=4;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = row; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// *       *       
// * *     * *     
// * * *   * * *   
// * * * * * * * *