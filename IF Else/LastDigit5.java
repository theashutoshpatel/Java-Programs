// Check weather programm of last digit is 5 or Not.
class LastDigit5 {
    public static void main(String[] args) {
        
        int n=123937345;
        int r=n%10;
        if(r==5)
            System.out.println("Yes same last digit");
        else
            System.out.println("No Last digit not same");
    }
}
