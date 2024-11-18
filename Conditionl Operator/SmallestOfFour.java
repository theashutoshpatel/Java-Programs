// Smallest of Four Number
class SmallestOfFour {
    public static void main(String[] args) {
        
        int a=21,b=76,c=69,d=4;
        int small=(a<b && a<c && a<d)?a:(b<c && b<d)?b:(c<d)?c:d;
        System.out.println("Smallest of 4nu: "+small);
    }
}
