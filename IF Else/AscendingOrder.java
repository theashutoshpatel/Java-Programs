// Print ascending order of three number 
class AscendingOrder {
    public static void main(String[] args) {

        int a = 20,b=40,c=24;
        // if (a > b) {
        //     int temp = a;
        //     a = b;
        //     b = temp;
        // }
        // if (a > c) {
        //     int temp = a;
        //     a = c;
        //     c = temp;
        // }
        // if (b > c) {
        //     int temp = b;
        //     b = c;
        //     c = temp;
        // }
        // System.out.println("Numbers in ascending order: " + a + ", " + b + ", " + c);
        int max=(a>b && a>c)?a:(b>c)?b:c;
        int min=(a<b && a<c)?a:(b<c)?b:c;
        int mid=(a+b+c)-(max+min);
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
 