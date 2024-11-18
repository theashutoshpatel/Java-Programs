public class Number7 {
    public static void main(String[] args) {
        int row = 4;
        int col = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i==1 && j==1 || i==2 && j==2 || i==3 && j==3 || i==4 && j==4) {
                    System.out.print("a ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

// a * * * 
// * a * * 
// * * a * 
// * * * a 
