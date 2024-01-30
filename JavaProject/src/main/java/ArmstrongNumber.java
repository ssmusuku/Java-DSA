public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153, originalNumber, reminder, result = 0;
        originalNumber = number;
        while(originalNumber != 0){
            reminder = originalNumber%10;
            result += Math.pow(reminder,3);
            originalNumber /= 10;
        }
        if(result == number){
            System.out.println("Given number is ArmstrongNumber");
        }else {
            System.out.println("Given number is not ArmstrongNumber");
        }

    }
}
