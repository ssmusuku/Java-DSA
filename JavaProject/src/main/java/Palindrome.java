
public class Palindrome {
    public boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length() - i -1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        if(p.isPalindrome("soeros"))
            System.out.println("Given String is palindrome");
        else
            System.out.println("Given String is not Palindrome");
    }
}
