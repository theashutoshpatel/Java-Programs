public class Number29 {

    public static void main(String[] args) {
        int row = 4;
        int col = row;
        int num = 1;
        char ch = 'a';
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i - j >= row - col) {
                    if (i % 2 != 0) {
                        System.out.print(ch + " ");
                        ch++;
                    } else {
                        System.out.print(num + " ");
                        num++;
                    }

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
// a
// 1 2
// b c d
// 3 4 5 6