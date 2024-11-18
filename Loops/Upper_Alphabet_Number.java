// WAP TO PRINT UPPER CASE ALPHABETS WITH NUMBERS IN VERTICSL WAY ?
class Upper_Alphabet_Number {
    public static void main(String[] args) {
        int num = 1;
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.println(ch + " " + num++);
        }
    }
}
