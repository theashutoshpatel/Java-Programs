// WAP to print number of the days in a month by Reading month number ?
class MonthNumber {
    public static void main(String[] args) {
        int n=10;
        switch(n){
            case 3,4,9,11 -> System.out.println("30 Days ");
            case 1,5,7,8,10,12 -> System.out.println("31 Days ");
            case 2,6 -> System.out.println("29 Days ");
            default -> System.out.println(" Not a Month days");
        }
    }
}
