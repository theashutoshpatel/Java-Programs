// Write a function to print the sum of all odd numbers from 1 to n.
class Q2 {
    public static int odd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0) // check the condition odd or not
                sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(odd(10));
    }
    
}
