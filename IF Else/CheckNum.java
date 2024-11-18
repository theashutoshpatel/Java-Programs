// Check weather given number characte Special or Not 
class CheckNum {
    public static void main(String[] args) {
        
        char ch='&';
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'|| ch>='0' && ch<='9')
            System.out.println("Not a Sepcial Charcter");
        else
            System.out.println("Yes special character");
    }
}
