// Largest of Five Number
class Maximum {
    public static void main(String[] args) {

        int a = 2000, b = 30, c = 424, d = 90, e = 12;
        if (a > b && a > c && a > d && a > e)
            System.out.println(a + " Largest Number");
        else if (b > c && b > d && b > e)
            System.out.println(b + " Lrgest Number");
        else if (c > d && c > e)
            System.out.println(c + " Largest Number");
        else if (d > e)
            System.out.println(d + " largest Number");
        else
            System.out.println(e + " Lrgest Number");
    }
}
