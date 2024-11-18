// Swap of a 2 number Without using third variable 
class Swap_without {
    public static void main(String[] args) {
        
        int a=20,b=30;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap of a Number: "+b);
        System.out.println("Swap of a Number: "+a);
    }
}
