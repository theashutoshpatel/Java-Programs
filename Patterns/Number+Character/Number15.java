class Number15 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        char ch = 'i';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(ch + " ");
                ch--;

                if (ch < 'a')
                    ch = 'i';

            }
            System.out.println();

        }
    }
}
// i h g f
// e d c b
// a i h g
// f e d c