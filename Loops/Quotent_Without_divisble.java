// WAP TO PRINT THE QUOTIENT OF THE NUMBER WITHOUT USING ANY DIVISION OPERATORS ?
class Quotent_Without_divisble {
    public static void main(String[] args) {
        

        int a=21,b=5,q=0;
        while(a>=b){
            a-=b;
            q++;
        }
        System.out.println(a);
    }
}
