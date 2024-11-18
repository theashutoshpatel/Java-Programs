// Smallest of Five Number
class Smallest {
    public static void main(String[] args) {

        int a = 20, b = 30, c = 4, d = 9, e = 12;
        if (a < b && a < c && a < d && a < e)
            System.out.println(a + " Smallest Number");
        else if (b < c && b < d && b < e)
            System.out.println(b + " Lrgest Number");
        else if (c < d && c < e)
            System.out.println(c + " Smallest Number");
        else if (d < e)
            System.out.println(d + " Smallest Number");
        else
            System.out.println(e + " Smallest Number");
    }
}
