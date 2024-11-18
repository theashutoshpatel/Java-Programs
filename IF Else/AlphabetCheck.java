// Check Weather is alphabet or not.
class AlphabetCheck {
    public static void main(String[] args) {
        
        char ch='9';
        if(ch>='A' && ch<='Z' || ch>='a'&& ch<='z')
            System.out.println("Yes Alphabet:"+ch);
        else
            System.out.println("Not a Alphabet");
    }
}
