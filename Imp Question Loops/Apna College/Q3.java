// Write a function which takes in 2 numbers and returns the greater of those two

class Q3 {
    public static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    
    public static void main(String[] args) {
        
        System.out.println(max(20, 100));
    }
}
