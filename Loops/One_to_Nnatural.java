// 2)WAP TO PRINT 1 TO N NATURAL NUMBERS ?

import java.util.Scanner; 
class One_to_Nnatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
