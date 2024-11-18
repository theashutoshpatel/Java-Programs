// Largest Of Seven Number.
class LargestOfSeven {
    public static void main(String[] args) {
        
        int a=200,b=30,c=60,d=992,e=9,f=80,g=10;
        int max=(a>b && a>c && a>d && a>e && a>f && a>g)?a:
                (b>c && b>d && b>e && b>f && b>g)?b:
                (c>d && c>e && c>f && c>g)?c:
                (d>e && d>f && d>g)?d:
                (e>f && e>g)?e:
                (f>g)?f:g;
        System.out.println("Largest of Seven Number: "+max);

    }
}
