class Number13 {
    public static void main(String[] args) {
        int row = 5;
        int col = row;
        for (int i = 1; i <= row; i++) {
            char num = 'e';
            for (int j = 1; j <= col; j++) {

                System.out.print(num + " ");
                num--;

            }
            System.out.println();
        }
    }
}
// e d c b a 
// e d c b a 
// e d c b a 
// e d c b a 
// e d c b a 