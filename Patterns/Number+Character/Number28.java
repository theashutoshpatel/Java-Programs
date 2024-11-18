class Number28 {

    public static void main(String[] args) {
        int row = 4;
        int col = row;
        int num=1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i - j >= row - col) {
                    System.out.print(num+" ");
                    num++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// 1    
// 2 3
// 4 5 6
// 7 8 9 10