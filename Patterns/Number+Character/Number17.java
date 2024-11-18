class Number17 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        char ch = 'A';
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= col; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();

        }
    }
}
// A B C D 
// E F G H 
// I J K L 
// M N O P 