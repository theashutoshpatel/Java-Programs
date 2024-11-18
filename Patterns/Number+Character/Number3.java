class Number3 {
    public static void main(String[] args) {

        int row = 4;
        int col = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 3 && j == 1) {
                    System.out.print("^ ");
                } else if (i == 4 && j == 4) {
                    System.out.print("@ ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
// O O O O 
// O O O O 
// ^ O O O 
// O O O @ 