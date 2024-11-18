// Smallest of Seven Number
class SmallestOfSeven {
    public static void main(String[] args) {
        
        int a=20,b=30,c=60,d=92,e=9,f=80,g=10;
        int small=(a<b && a<c && a<d && a<e && a<f && a<g)?a:
                    (b<c && b<d && b<e && b<f && b<g)?b:
                    (c<d && c<e && c<f && c<g)?c:
                    (d<e && d<f && d<g)?d:
                    (e<f && e<g)?e:
                    (f<g)?f:g;
        System.out.println("Smallest of Seven Number: "+small);
    }
}
