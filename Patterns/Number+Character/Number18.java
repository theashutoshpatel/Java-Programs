class Number18 {
    public static void main(String[] args) {
        int row = 4;
        for (int i = 1; i <= row; i++) {
            if (i % 2 != 0) {
                for (char j = 'A'; j <= 'D'; j++) {
                    System.out.print(j);
                }
            } else {
                for (int k = 1; k <= 4; k++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }

    }
}
