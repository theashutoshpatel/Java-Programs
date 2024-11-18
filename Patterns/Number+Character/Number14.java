class Number14 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(num + " ");
                num++;

                if (num == 10)
                    num = 1;

            }
            System.out.println();

        }
    }
}
// 1 2 3 4 
// 5 6 7 8
// 9 1 2 3
// 4 5 6 7