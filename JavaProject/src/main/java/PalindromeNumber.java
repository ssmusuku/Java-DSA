public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 78897, originalNumber, reminder, rev = 0;
        originalNumber = number;
        while(originalNumber !=0){
            reminder = originalNumber%10;
            rev = rev*10 + reminder;
            originalNumber /=10;
        }
        if(rev == number){
            System.out.println("Palindrome Number");
        }else
        {
            System.out.println("Not Palindrome");
        }
    }
}
