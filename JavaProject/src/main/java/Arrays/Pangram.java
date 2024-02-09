package Arrays;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Pangram obj = new Pangram();
        obj.checkIfPangram(sentence);
    }
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for(char ch = 'a';ch<='z';ch++){
            if(!sentence.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}
