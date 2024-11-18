class Number22 {
    public static void main(String[] args) {
        int num = 1;
        char ch = 'a';
        for (int i = 1; i <= 4; i++) {
            // Print letter at the start
            System.out.print(ch + " ");
            ch++;

            System.out.print(num + "+" + (num + 1) + " ");
            num += 2;

            System.out.print(ch);
            ch++;

            System.out.println();
        }
    }
}

// a 1+2 b
// c 3+4 d
// e 5+6 f
// g 7+8 h