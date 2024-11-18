// Largest of 5 number.
class LargestOFFive {
    public static void main(String[] args) {
        
        int a=29,b=60,c=90,d=10,e=20;
        int max=(a>b && a>c && a>d && a>e)?a:(b>c && b>d && b>e)?b:(c>d && c>e)?c:(d>e)?d:e;
        System.out.println("Largest of 5nu: "+max);
    }
    
}
