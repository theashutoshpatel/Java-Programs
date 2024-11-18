// WAP TO PRINT PRIME NUMBER BY READING IT'S POSITION OF NUMBER ?
class Prime_number_position {
    public static void main(String[] args) {
        int n = 45687;

        int rev = 0, p = 1;
        while (n != 0) {
            int r = n % 10;
            int c = 0;
            for (int i = 2; i <= r / 2; i++) {
                if (r % i == 0)
                    c++;
            }
            if (c == 0 && r >= 2) {
                rev = r * p + rev;
                p *= 10;
            }
            n /= 10;
        }
        System.out.println(rev);
    }
}
