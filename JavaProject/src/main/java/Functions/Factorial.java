package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Factorial fc = new Factorial();
        fc.factorial(a);
    }

    private void factorial(int a) {
        int fact=1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
