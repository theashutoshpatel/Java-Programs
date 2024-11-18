public class Number31 {

    public static void main(String[] args) {
        int rows = 4;
        int num = 1;
        char ch = 'a';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {

                if (j % 2 != 0) {
                    System.out.print(num + " ");
                    num++;
                }

                else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }

}
// 1 
// 2 a     
// 3 b 4   
// 5 c 6 d 