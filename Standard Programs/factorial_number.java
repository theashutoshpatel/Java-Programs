// WAP TO PRINT FACTORIAL OF A NUMBER ?
public class factorial_number {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
