public class Number23 {
    public static void main(String[] args) {
        int num=1;
        char ch='a';
        for(int i=1;i<=4;i++){
            System.out.print(ch+" ");
            ch++;

            System.out.print(num+" ");
            num++;

            System.out.print(ch+" ");
            ch++;

            System.out.print(num+" ");
            num++;

            System.out.print(ch+" ");
            ch++;
            System.out.println();

        }
        System.out.print("i " + num + " + " + (num + 1) + " j");
        
    }
}
// a 1 b 2 c 
// d 3 e 4 f
// g 5 h 6 i
// j 7 k 8 l
// i 9 + 10 j