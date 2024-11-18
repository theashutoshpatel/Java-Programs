class Number12 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;
        for (int i = 1; i <= row; i++) {
            int num = 5;
            for (int j = 1; j <= col; j++) {

                System.out.print(num + " ");
                num--;

            }
            System.out.println();
        }
    }
}
