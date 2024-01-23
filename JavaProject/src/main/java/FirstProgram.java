public class FirstProgram {

    public static boolean isPrime(int n){
        if(n<=1) {
            return false;
        }
        for(int i =2 ; i<= Math.sqrt(n);i++){
            if(n % i ==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if (isPrime(36)) {
            System.out.println(" is a prime number.");
        } else {
            System.out.println(" is not a prime number.");
        }
    }
}
