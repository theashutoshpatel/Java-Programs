public class Q6 {
    public static void main(String[] args) {
        int n = 100; // Limit up to which Fibonacci series should be printed
        int a = 0, b = 1; // First two Fibonacci numbers

        System.out.print("Fibonacci series up to " + n + ": ");

        while (a <= n) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
