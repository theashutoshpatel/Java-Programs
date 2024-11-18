class Days {
    public static void main(String[] args) {
        int n=6;
        switch(n){
            case 1 -> System.out.println("S,M,T,W,T,F,S");
            case 2 -> System.out.println("M,T,W,T,F,S");
            case 3 -> System.out.println("T,W,T,F,S");
            case 4 -> System.out.println("W,T,F,S");
            case 5 -> System.out.println("T,F,S");
            case 6 -> System.out.println("F,S");
            case 7 -> System.out.println("S");
            default -> System.out.println("Not a week day number");

        }
    }    
}
