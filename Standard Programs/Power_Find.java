// WAP TO PRINT THE X POWER N ?
class Power_Find {
    public static void main(String[] args) {
        int x = 20, n = 2;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println(result);
    }
}
