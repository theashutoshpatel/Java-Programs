// WAP TO PRINT SPY NUMBER BY READING IT'S POSITION OF NUMBER ?
class Spy_number_position {
    public static void main(String[] args) {
        int n = 45789;
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            int temp = r;
            while (temp != 0) {
                int digit = temp % 10;
                product *= digit;
                sum += digit;
                temp /= 10;
            }
            if (sum == product)
                System.out.println("Perfect digit " + r);
            else
                System.out.println("not a perfect " + r);

            n /= 10;

        }
    }
}
