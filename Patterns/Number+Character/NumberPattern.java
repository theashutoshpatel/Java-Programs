public class NumberPattern {

    public static void main(String[] args) {
        int row = 4;
        // int num = 1; 
        // char ch = 'a'; 
        
        for (int i = 1; i <= row; i++) {
            int num=1;
            char ch='a';
            if (i % 2 != 0) {  
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {  
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();  
        }
    }
}
// 1 
// a b
// 1 2 3
// a b c d