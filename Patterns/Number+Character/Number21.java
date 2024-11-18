class Number21 {
    public static void main(String[] args) {
        int row = 4;
        int num = 1;
        char ch = 'a';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j % 2 != 0) {
                    System.out.print(num + " ");
                    // ch++;
                } else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}
