class Number16 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        for (int i = 1; i <= row; i++) {
            int num=1;
            for (int j = 1; j <= col; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
    }
}
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4