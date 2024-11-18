class SummationOfNumber {
    public static void sum(int a,int b) {
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        sum(1, 5);
    }
}