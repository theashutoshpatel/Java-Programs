class Number32 {
        public static void main(String[] args) {
            int n = 5; 
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
    
                for (int j = n - 1; j >= i; j--) {
                    System.out.print((char)('a' + j) + " ");
                }
    
                System.out.println();
            }
        }
    
    
}
