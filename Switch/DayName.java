// WAP to print Day Name of the Day by reading the name of the day.
class DayName {
    public static void main(String[] args) {
        int day=8;
        switch(day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thrusday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Not a Week day");
        }
    }
}
