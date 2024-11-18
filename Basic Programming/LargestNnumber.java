// Largest of three number
class LargestNnumber {
    public static void main(String[] args) {
        
        int num1=20,num2=300,num3=40;
        int max=(num1>num2)?num1:num2;
        int max1=(max>num3)?max:num3;
        System.out.println("Largest of Three number: "+max1);
    }
}
