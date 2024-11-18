// smallest Of three number
class SmallestNumber {
    public static void main(String[] args) {
        
        int num1=2,num2=3,num3=4;
        int max=(num1<num2)?num1:num2;
        int max1=(max<num3)?max:num3;
        System.out.println("Smallest of three number: "+max1);
    }
}
