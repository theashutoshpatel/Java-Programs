// WAP TO PRINT THE REMAINDER OF THE NUMBER WITHOUT USING ANY DIVISION OPERATORS ?
class Reminder_without_divisble {
    public static void main(String[] args) {

        int a = 21, b = 5;
        while (a >= b) {
            a -= b;
        }
        System.out.println(a);
    }
}
