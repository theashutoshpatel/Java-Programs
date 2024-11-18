public class Number20 {
    public static void main(String[] args) {
        int row = 4;
        int num = 1;
        char ch = 'A';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j % 2 != 0) {
                    System.out.print(ch +" ");
                    ch++;

                } else {

                    System.out.print(num +" ");
                    num++;

                }
                
            }
            System.out.println();
        }
    }
}
// 1 2 3 4
// a b c d
// 5 6 7 8
// e f g h
