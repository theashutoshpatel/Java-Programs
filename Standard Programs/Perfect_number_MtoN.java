// WAP TO PRINT PERFECT NUMBERS BETWEEN M AND N ?
class Perfect_number_MtoN {
    public static void main(String[] args) {
        int m = 10, n = 50;
        int sum = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i)
                System.out.println("perfect number: " + i);
            else
                System.out.println("Not a perfect Number: " + i);
        }
    }
}