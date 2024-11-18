// 0 1 1 2 3 5 8 13
class Q10{
public static void main(String[] args) {
    int a=0,b=1;
    int n=10;
    int sum=0;
    for(int i=1;i<=n;i++){
        System.out.println(a);
        sum+=a;
        int c=a+b;
        a=b;
        b=c;

    }
    System.out.println(sum);
}
}


// Up to N find
// int n=100;
// int a=0,b=1;
// if(a<=n){
//     System.out.println(a);
//     int c=a+b;
//     a=b;
//     b=c;
// }


