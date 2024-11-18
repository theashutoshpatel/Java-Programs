// WAP TO PRINT PERFECT NUMBER BY READING IT'S POSITION OF NUMBER ?
class Perfect_number_position {
    public static void main(String[] args) {
        int n = 547963;

        while (n != 0) {
            int r = n % 10;
            int temp = r;
            int sum = 0;
            for (int i = 1; i <= r / 2; i++) {
                if (temp % i == 0) {
                    sum += i;
                }
            }
            if (sum == temp && r != 0)
                System.out.println("Perfect number: " + r);
            else
                System.out.println("Not a Perfect: " + r);
            n /= 10;
        }
    }
}
