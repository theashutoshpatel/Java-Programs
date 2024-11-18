// WAP TO PRINT LOWER CASE ALPHABET AND UPPER CASE ALPHABET VERTICAL WAY ?
class Lower_Upper_Alphabet_Asc {
    public static void main(String[] args) {        
        for(char ch1='a',ch2='A'; ch1<='z' && ch2<='Z' ; ch1++, ch2++){
            System.out.println(ch1+" "+ch2);
        }
    }
}
