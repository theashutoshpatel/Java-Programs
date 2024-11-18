public class Number40 {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            ch -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }
    }
}
