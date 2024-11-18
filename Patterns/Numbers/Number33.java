class Number33 {

    public static void main(String[] args) {
        int row = 5;
        int col = row;
        for (int i = 1; i <= row; i++) {
            int n = 5;
            char ch = 'a';
            for (int j = 1; j <= col; j++) {
                if (i + j <= row + 1) {
                    if (i % 2 != 0) {
                        System.out.print(n + " ");
                        n--;
                    } else {
                        System.out.print(ch + " ");
                        ch++;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
