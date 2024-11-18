// WAP TO PRINT ALPHABETS IN DESENDIG ORDER VERTICALY ?
class Lower_Upper_Alphabet_Desc {
    public static void main(String[] args) {
        for(char cLower='z',cUpper='Z';cLower>='a' && cUpper>='A';cLower--,cUpper--){
            System.out.println(cLower+" "+cUpper);
        }
    }    
}
