class Star11 {
    public static void main(String[] args) {
        int n = 4;
        int row = n;
        int space = n-1;
        int star1 = 1;
        int star2 = n;
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= star1; j++){
                System.out.print('*');
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(' ');
            }
            for(int j = 1; j <= star2; j++){
                System.out.print('*');
            }
            System.out.println();
            space--;
            star2--;
            star1++;
        }
    }
}