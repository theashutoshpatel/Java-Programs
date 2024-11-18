// WAP TO CHECK WHETHER GIVEN NUMBER IS ARMSTONG NUMBER OR NOT ?
class Armstrong_number {
    public static void main(String[] args) {
        
        int n=153;
        int temp=n;
        int num=0;
        while(n!=0){
            int r=n%10;
            num+=r*r*r;
            n/=10;
        }
        if (temp==num) {
            System.out.println("Armstrong number: ");   
        }else{
            System.out.println("Not a armstrong number");
        }
    }
}
